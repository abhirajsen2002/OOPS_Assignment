class Var_2 {
	int n;

	public Var_2() {
		n = 0;
	}

	public Var_2(int n) {
		this.n = n;
	}

	public synchronized void inc(int delta) {
		n += delta;
		System.out.println("Value after increment : " + n);
	}

	public synchronized void dec(int delta) {
		n -= delta;
		System.out.println("Value after decrement : " + n);
	}
}

class IncThread_2 implements Runnable {
	Var_2 v;
	Thread t;

	public IncThread_2(Var_2 v, String threadName) {
		this.v = v;
		t = new Thread(this, threadName);
	}

	public void run() {
		v.inc(2);
	}
}

class DecThread_2 implements Runnable {
	Var_2 v;
	Thread t;

	public DecThread_2(Var_2 v, String threadName) {
		this.v = v;
		t = new Thread(this, threadName);
	}

	public void run() {
		v.dec(2);
	}
}

public class Prog_2 {
	public static void main(String[] args) {
		Var_2 v = new Var_2(5);
		IncThread_2 i1 = new IncThread_2(v, "incThread1");
		IncThread_2 i2 = new IncThread_2(v, "incThread2");
		DecThread_2 d1 = new DecThread_2(v, "decThread1");
		DecThread_2 d2 = new DecThread_2(v, "decThread2");

		i1.t.start();
		i2.t.start();
		d1.t.start();
		d2.t.start();

		try {
			i1.t.join();
			i2.t.join();
			d1.t.join();
			d2.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Value after all threads finished : " + v.n);
	}
}
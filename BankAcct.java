import java.util.*;

public class BankAcct {
	private int acc_no;
	private double balance;
	private static double interest;

	static {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the interest: ");
		interest = sc.nextDouble();
		sc.close();
	}

	public BankAcct() {
		acc_no = -1;
		balance = 0.0;
		// interest = null;
	}

	public BankAcct(int acc_no) {
		this();
		this.acc_no = acc_no;
	}

	public BankAcct(int acc_no, double balance) {
		this(acc_no);
		this.balance = balance;
	}

	BankAcct(BankAcct b) {
		this(b.acc_no, b.balance);
	}

	public BankAcct setAccNo(int acc_no) {
		this.acc_no = acc_no;
		return this;
	}

	public static void setInterest(double interest) {
		BankAcct.interest = interest;
	}

	public BankAcct setBalance(double balance) {
		this.balance = balance;
		return this;
	}

	public int getAccNo() {
		return acc_no;
	}

	public double getInterest() {
		return interest;
	}

	public double getBalance() {
		return balance;
	}

	public void display() {
		System.out.println("Acc No: " + getAccNo());
		System.out.println("Interest rate: " + getInterest() + "%");
		System.out.println("Balance: $" + getBalance());
	}

	public static void main(String[] args) {
		BankAcct obj = new BankAcct().setAccNo(10).setBalance(200.0);
		obj.display();
		System.out.println();
		BankAcct obj_2 = new BankAcct(20).setBalance(400);
		obj_2.display();
		System.out.println();
		setInterest(10);
		System.out.println("\nInterest rate changed to 10%.\n");
		obj_2.display();
		System.out.println();
		obj.display();
		System.out.println();
		BankAcct obj_3 = new BankAcct(20, 600);
		obj_3.display();
	}

}

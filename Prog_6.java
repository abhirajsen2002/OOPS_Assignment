import java.util.Scanner;
public class Prog_6 {
	void show(int x) {
		System.out.println(x);
	}
	
	void show(double x) {
		System.out.println(x);
	}
	public static void main(String[] args) {
		Prog_6 obj = new Prog_6();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number(short): ");
		obj.show(sc.nextShort());
		System.out.print("Enter the number(double): ");
		obj.show(sc.nextDouble());
	}

}

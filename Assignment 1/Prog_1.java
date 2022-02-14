import java.util.Scanner;

public class Prog_1 {
	public static void main(String[] args) {
		short x, y;
		short sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first short integer : ");
		x = sc.nextShort();
		System.out.print("Enter second short integer : ");
		y = sc.nextShort();
		sum = (short)(x + y);
		System.out.println("Sum = " + sum);
		sc.close();
	}
}

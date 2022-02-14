import java.util.Scanner;
import java.math.*;

public class Prog_4 {
	static final double pi = 3.14;

	public static void main(String[] args) {
		double radius;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle : ");
		radius = sc.nextDouble();
		double area = pi * Math.pow(radius, 2);
		System.out.print("Area = " + area);
		sc.close();
	}

}

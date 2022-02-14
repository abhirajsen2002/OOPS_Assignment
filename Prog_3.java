import java.util.*;
public class Prog_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cm;
		int feet,inch;
		System.out.print("Enter the length in cm : ");
		cm = sc.nextInt();
		feet = (int)(cm/30.5);
		inch = (int)((cm - 30.5*feet)/2.54);
		
		System.out.println("Height = " + feet + "ft "+ inch + "in.");
		sc.close();
	}

}

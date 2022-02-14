import java.util.*;

public class Prog_5 {
	public static void main(String[] args) {
		System.out.println("_________Problem 1_________\n\n\n");
		String str1;
		String str2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string for the first problem : ");
		str1 = sc.next();
		str2 = str1;

		System.out.println("_________Checking for '=='_________");
		if (str1 == str2) {
			System.out.print(true);
		} else {
			System.out.print(false);
		}

		System.out.println("\n_________Checking for '.equals()'_________");

		if (str1.equals(str2)) {
			System.out.print(true);
		} else {
			System.out.print(false);
		}

		System.out.println("\n\n\n_________Problem 2_________\n\n\n");
		String str3;
		String str4;
		System.out.print("Enter the first string for the second problem : ");
		str3 = sc.next();
		System.out.print("Enter the second string for the second problem : ");
		str4 = sc.next();
		System.out.println("_________Checking for '=='_________");
		if (str3 == str4) {
			System.out.print(true);
		} else {
			System.out.print(false);
		}

		System.out.println("\n_________Checking for '.equals()'_________");

		if (str3.equals(str4)) {
			System.out.print(true);
		} else {
			System.out.print(false);
		}

		sc.close();
	}

}

package Prog_10;

import java.util.*;

public class Metric {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Type MtoK for Mile to Kilometer convertion.");
			System.out.println("Type KtoM for Kilometer to Mile convertion.");
			System.out.print("Enter choice: ");
			String str = sc.next();
			str = str.toLowerCase();
			System.out.println("Enter value: ");
			double n = sc.nextDouble();
			double y = new ConversionFactory().getConverter(metrix.valueOf(str)).convert(n);
			if (str.equalsIgnoreCase("mtok")) {
				System.out.print("Result = " + y + "km");
			} else if (str.equalsIgnoreCase("ktom")) {
				System.out.print("Result = " + y + "miles");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		finally {

			sc.close();
		}
	}
}

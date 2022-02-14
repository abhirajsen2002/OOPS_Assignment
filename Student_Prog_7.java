import java.util.*;

public class Student_Prog_7 {
	private int roll;
	private String name;
	private double score;

	public void set_details(int roll, String name, double score) {
		this.roll = roll;
		this.name = name;
		this.score = score;
	}

	public void get_details() {
		System.out.println("Roll number: " + roll);
		System.out.println("Name: " + name);
		System.out.println("Score: " + score);
	}

	public Student_Prog_7 copy() {
		Student_Prog_7 obj = new Student_Prog_7();
		obj.set_details(this.roll, this.name,this.score);
		return obj;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter roll number: ");
		int roll = sc.nextInt();
		System.out.print("Enter name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Enter score: ");
		double score = sc.nextDouble();
		
		Student_Prog_7 obj1 = new Student_Prog_7();
		obj1.set_details(roll, name, score);
		
		System.out.println("\nPrinting details for student\n");
		
		obj1.get_details();
		
		System.out.println("\nCoping the data to another object\n");
		
		Student_Prog_7 obj2 = obj1.copy();
		
		System.out.println("\nPrinting details for student(copied)\n");
		
		obj2.get_details();
		sc.close();
	}
}

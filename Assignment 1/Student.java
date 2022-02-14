import java.util.*;

public class Student {
	private int roll;
	private String name;
	private double score;

	public Student() {
		roll = 0;
		name = null;
		score = 0.0;
	}

	public Student(int roll) {
		this();
		this.roll = roll;
	}

	public Student(int roll, String name) {
		this(roll);
		this.name = name;
		score = 0.0;
	}

	public Student(int roll, String name, double score) {
		this(roll, name);
		this.score = score;
	}

	Student(Student s) {
		this(s.roll, s.name, s.score);
	}

	public void display() {
		System.out.println("Roll number: " + roll);
		System.out.println("Name: " + name);
		System.out.println("Score: " + score);
	}

	public Student set_roll(int roll) {
		this.roll = roll;
		return this;
	}

	public Student set_name(String name) {
		this.name = name;
		return this;
	}

	public Student set_score(double score) {
		this.score = score;
		return this;
	}

	public static void main(String[] args) {
		Student obj = new Student(1, "Abiraj Sen", 95.7);
		System.out.println("\nPrinting student details...\n");
		obj.display();
		Student obj_copy = new Student(obj);
		System.out.println("\nCoping using copy constructor");
		System.out.println("Printing student details...\n");
		obj_copy.display();

		System.out.println("\nChanging some values in original object to check if deep copy is done...");

		obj.set_roll(2).set_name("Toby Kar").set_score(98.3);
		obj.display();

		System.out.println("\nPrinting student details of copied object...");
		obj_copy.display();
	}
}

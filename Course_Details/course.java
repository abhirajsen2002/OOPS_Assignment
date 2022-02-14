package Course_Details;

import java.util.Scanner;

public class course {
	String name;
	Instructor ins;
	Textbook txt;

	public course() {
		name = null;
		ins = null;
		txt = null;
	}

	public course(String name) {
		this();
		this.name = name;
	}

	public course(String name, Instructor ins) {
		this(name);
		this.ins = ins;
	}

	public course(String name, Textbook txt) {
		this(name);
		this.txt = txt;
	}

	public course(String name, Instructor ins, Textbook txt) {
		this(name, ins);
		this.txt = txt;
	}

	course(course c) {
		this.name = c.name;
		this.ins = c.ins;
		this.txt = c.txt;
	}

	public course setName(String name) {
		this.name = name;
		return this;
	}

	public course setInstructor(Instructor ins) {
		this.ins = ins;
		return this;
	}

	public course setTextbook(Textbook txt) {
		this.txt = txt;
		return this;
	}

	public String getName() {
		return name;
	}

	public Instructor getInstructor() {
		return ins;
	}

	public Textbook getTextbook() {
		return txt;
	}

	void display() {
		System.out.println("Course name: " + getName());
		System.out.println("\nInstructor details:");
		if (getInstructor() != null) {
			System.out.println("Name: " + getInstructor().getName());
			System.out.println("Phone number: " + getInstructor().getPhoneNumber());
		} else {
			System.out.println("No instructor set yet.");
		}
		System.out.println("\nTextbook details:");
		if (getTextbook() != null) {
			System.out.println("Name: " + getTextbook().getTitle());
			System.out.println("Author: " + getTextbook().getAuthor());
			System.out.println("Publisher: " + getTextbook().getPublisher());
		} else {
			System.out.println("No textboook set yet.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Instructor i; Textbook t;
		 */

		System.out.print("Enter name of the course: ");
		String name_course;
		name_course = sc.next();

		System.out.println("\nInstructor details:");
		System.out.print("Enter the name: ");
		sc.nextLine();
		String name_ins = sc.nextLine();
		System.out.print("Enter phone number: ");
		long ph_no = sc.nextLong();

		System.out.println("\nTextbook details:");
		System.out.print("Enter name of the book: ");
		sc.nextLine();
		String book_name = sc.nextLine();
		System.out.print("Enter name of the author: ");
		// sc.nextLine();
		String author_name = sc.nextLine();
		System.out.print("Enter name of the publisher: ");
		// sc.nextLine();
		String publisher_name = sc.nextLine();

		course obj = new course().setName(name_course)
				.setInstructor(new Instructor().setName(name_ins).setPhoneNumber(ph_no))
				.setTextbook(new Textbook().setAuthor(author_name).setTitle(book_name).setPublisher(publisher_name));
		System.out.println("\n");

		System.out.print("Do you want to change the instructor ");

		obj.display();
	}
}

import java.util.Scanner;

class invalidScoreException extends Exception {
}

public class Student_Prog_5 {
	int roll;
	String name;
	double score;

	Student_Prog_5(int r, String n, double s) {
		roll = r;
		name = n;
		score = s;
	}

	Student_Prog_5() {
		roll = 0;
		name = null;
		score = 0.0;
	}

	Student_Prog_5 setScore(double score) throws Exception {
		if ((score < 0) || (score > 100)) {
			throw new invalidScoreException();
		}
		this.score = score;
		return this;
	}

	Student_Prog_5 setName(String name) {
		this.name = name;
		return this;
	}

	Student_Prog_5 setRoll(int roll) {
		this.roll = roll;
		return this;
	}

	double getScore() {
		return score;
	}

	String getName() {
		return name;
	}

	int getRoll() {
		return roll;
	}

	public static void main(String[] args) {
		String name;
		int roll;
		double score;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = sc.nextLine();
		// sc.nextLine();
		System.out.print("Enter roll number: ");
		roll = sc.nextInt();
		System.out.print("Enter score: ");
		score = sc.nextDouble();
		Student_Prog_5 obj = new Student_Prog_5();
		try {
			obj.setName(name).setRoll(roll).setScore(score);
		} catch (invalidScoreException e) {
			System.out.println("Invalid marks entered.");
			System.out.println("Marks set to zero.");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			sc.close();
		}

		System.out.println("Student details:\n");
		System.out.println("Name: " + obj.getName());
		System.out.println("Roll number: " + obj.getRoll());
		System.out.println("Score: " + obj.getScore());
	}

}

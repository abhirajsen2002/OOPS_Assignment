import library.book.*;
import library.member.*;
import library.transaction.*;
import java.util.*;

public class Prog_4 implements LibraryFeatures {
	static final Booklist bl = new Booklist();
	static final Memberlist ml = new Memberlist();
	static final Transactionlist tl = new Transactionlist();

	public void addBook_I() {
		bl.addBook();
	}

	public void searchBook_I() {
		bl.show();
	}

	public void viewAllBook_I() {
		bl.display();
	}

	public void addMember_I() {
		ml.addMember();
	}

	public void searchMember_I() {
		ml.show();
	}

	public void viewAllMember_I() {
		ml.display();
	}

	public void issue_I() {
		Scanner in1 = new Scanner(System.in);
		System.out.print("Enterbook id: ");
		String id = in1.next();
		if (!bl.checkid(id)) {
			System.out.print("Enter Correct book id!!");
			return;
		}
		System.out.print("Entermember id: ");
		String id2 = in1.next();
		if (!ml.checkid(id2)) {
			System.out.print("Enter Correct member id!!");
			return;
		}
		if (bl.issue(id, -1) && ml.issue(id2, 1)) {
			tl.addTransaction(id, id2);
			System.out.print("Book Issued!!");
		}
	}

	public void returnn_I() {
		Scanner in2 = new Scanner(System.in);
		System.out.print("Enterbook id: ");
		String id3 = in2.next();
		if (!bl.checkid(id3)) {
			System.out.print("Enter Correct book id!!");
			return;
		}
		System.out.print("Entermember id: ");
		String id4 = in2.next();
		if (!ml.checkid(id4)) {
			System.out.print("Enter Correct member id!!");
			return;
		}
		if (bl.issue(id3, 1) && ml.issue(id4, -1)) {
			tl.addTransaction(id3, id4);
			System.out.print("Book Returned!!");
		}
	}

	public void start() {
		loop1: do {
			System.out.println(
					"\n1.Add_book\n2.Display all\n3.Display partricular\n4:Add Member\n5:Display all member\n6:Display Particular member\n7:Issue a book\n8:Return a book\n0.Exit\n");
			Scanner in = new Scanner(System.in);
			System.out.print("Enter choice: ");
			int choice = in.nextInt();
			switch (choice) {
			case 1:
				addBook_I();
				break;
			case 2:
				viewAllBook_I();
				break;
			case 3:
				searchBook_I();
				break;
			case 4:
				addMember_I();
				break;
			case 5:
				viewAllMember_I();
				break;
			case 6:
				searchMember_I();
				break;
			case 7:
				issue_I();
				break;
			case 8:
				returnn_I();
				break;
			case 0:
				break loop1;
			}
		} while (true);
	}

	public static void main(String[] args) {
		Prog_4 l = new Prog_4();
		l.start();
	}
}
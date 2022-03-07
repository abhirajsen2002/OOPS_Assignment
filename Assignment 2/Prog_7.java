import java.util.*;

public class Prog_7 {
	String[] getArrayOfWords(String str) {
		String[] arrayOfWords = str.split("[. , @]");
		return arrayOfWords;
	}

	int countString(String str, String st) {
		int counter = 0;
		String[] words = getArrayOfWords(str);
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(st)) {
				counter++;
			}
		}
		return counter;
	}

	int countCharacter(String str, char st) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == st) {
				System.out.println("Letter: " + i);
				counter++;
			}
		}
		return counter;
	}

	boolean startsWith(String str, String st) {
		String[] words = getArrayOfWords(str);
		return (words[0].equals(st));
	}

	void tokenize(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isWhitespace(ch) || ch == '@' || ch == '.') {
				if (newStr != "") {
					System.out.println("Token: " + newStr);
					newStr = "";
				}
			} else {
				newStr += ch;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();

		Prog_7 obj = new Prog_7();

		System.out.println("'a' occurs " + obj.countCharacter(str, 'a') + " times.");
		System.out.println("\"and\" occurs " + obj.countString(str, "and") + " times.");
		if (obj.startsWith(str, "The")) {
			System.out.println("The string starts with \"The\"");
		} else {
			System.out.println("The string does not start with \"The\"");
		}
		obj.tokenize(str);
	}
}

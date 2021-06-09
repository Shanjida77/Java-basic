package basic1;

import java.util.Scanner;

public class Penultimate_60 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input a String: ");
		String str = in.nextLine();
		String[] words = str.split("[ ]");
		System.out.println("Penultimate word: " + words[words.length - 2]);

	}

}

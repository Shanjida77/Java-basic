package basic1;

import java.util.Scanner;

public class Reverseword_61 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input a word: ");
		char[] word = in.nextLine().toCharArray();
		String result = " ";
		for (int i = word.length - 1; i >= 0; i--) {
			result += word[i];
		}
		System.out.println("Reverse word: " + result);

	}

}

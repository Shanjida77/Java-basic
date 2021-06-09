package basic1;

import java.util.Scanner;

public class Range_58 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input a sentence: ");
		String x = in.nextLine();

		String upperCase = " ";
		Scanner str = new Scanner(x);

		while (str.hasNext()) {
			String word = str.next();
			upperCase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";

		}
		System.out.println(upperCase.trim());
	}

}

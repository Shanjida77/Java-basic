package basic1;

import java.util.Scanner;

public class StrToInt_51 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number(string): ");
		String str = in.nextLine();

		int x = Integer.parseInt(str);

		System.out.printf("The integer value is: " + x);
	}

}

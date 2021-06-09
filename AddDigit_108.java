package basic1;

import java.util.Scanner;

public class AddDigit_108 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Number: ");
		int x = in.nextInt();

		int rem = 0, sum = 0;

		while (x != 0) {
			rem = x % 10;
			sum = x / 10;
			System.out.print("Sum: " + (rem + sum));
			break;
		}

	}

}

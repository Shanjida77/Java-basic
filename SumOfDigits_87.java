package basic1;

import java.util.Scanner;

public class SumOfDigits_87 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input an integer: ");
		int n = in.nextInt();

		int rem, sum = 0;

		while (n != 0) {
			rem = n % 10;
			sum += rem;
			n = n / 10;
		}
		System.out.println("Sum of digits: " + sum);
	}

}

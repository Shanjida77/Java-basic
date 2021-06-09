package basic1;

import java.util.Scanner;

public class MultiplyBinary_18 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input first binary number: ");
		int b = in.nextInt();
		System.out.print("Input second binary number: ");
		int a = in.nextInt();
		int sum = a * b;
		System.out.println("The sum of two binary no is:\n" + Integer.toBinaryString(sum));

	}

}

package basic1;

import java.util.Scanner;

public class COmpare_32 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input first integer:");
		int a = in.nextInt();

		System.out.print("Input second integer:");
		int b = in.nextInt();

		if (a == b)
			System.out.println("Number is equal");
		if (a != b)
			System.out.println("Number is not equal");
		if (a < b)
			System.out.println("A is smaller than B");
		if (a <= b)
			System.out.println("A is smaller or equal than B");

	}

}

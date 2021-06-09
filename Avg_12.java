package basic1;

import java.util.Scanner;

public class Avg_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input first number: ");
		int x = in.nextInt();

		System.out.print("Input second number: ");
		int y = in.nextInt();

		System.out.print("Input third number: ");
		int z = in.nextInt();

		int avg = (x + y + z) / 3;

		System.out.println("Average is = " + avg);

	}

}

package basic1;

import java.util.Scanner;

public class swap_15 {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a:");
		int a = in.nextInt();

		System.out.print("Enter b:");
		int b = in.nextInt();

		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swap:\n" + "A is:" + a + "\nB is:" + b);
		;

	}

}

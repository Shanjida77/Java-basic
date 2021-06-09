package basic1;

import java.util.Scanner;

public class ArithmeticAdd_111 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("First number: ");
		int x = in.nextInt();

		System.out.print("Second number: ");
		int y = in.nextInt();

		int result = Math.addExact(x, y);

		System.out.println("Sum: " + result);
	}

}

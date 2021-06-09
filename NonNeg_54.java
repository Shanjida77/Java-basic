package basic1;

import java.util.Scanner;

public class NonNeg_54 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input the first number: ");
		int x = in.nextInt();
		System.out.print("Input the second number: ");
		int y = in.nextInt();
		System.out.print("Input the third number: ");
		int z = in.nextInt();

		System.out.print("The result is: " + test(x, y, z, true));
	}

	public static boolean test(int p, int q, int r, boolean xyz) {
		return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
	}

}

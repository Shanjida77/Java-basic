package basic1;

import java.util.Scanner;

public class DeciToOct_21 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input Decimal number: ");
		int dec = in.nextInt();

		int oct[] = new int[100];
		int i = 1, j = 0;

		while (dec != 0) {
			oct[i++] = dec % 8;
			dec /= 8;

		}
		System.out.print("Octal num is: ");

		for (j = i - 1; j > 0; j--) {
			System.out.print(oct[j]);
		}

	}

}

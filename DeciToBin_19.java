package basic1;

import java.util.Scanner;

public class DeciToBin_19 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input Decimal number: ");
		int dec = in.nextInt();

		int bin[] = new int[100];
		int i = 1, j = 0;

		while (dec != 0) {
			bin[i++] = dec % 2;
			dec /= 2;

		}
		System.out.print("Binary num is:\n");

		for (j = i - 1; j > 0; j--) {
			System.out.print(bin[j]);
		}

	}

}

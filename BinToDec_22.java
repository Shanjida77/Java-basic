package basic1;

import java.util.Scanner;

public class BinToDec_22 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input Binary number: ");
		int bin = in.nextInt();

		int dec = 0;
		int j = 1;

		while (bin != 0) {
			int rem = bin % 10;
			dec += rem * j;
			j *= 2;
			bin /= 10;

		}
		System.out.print("Decimal num is: " + dec);

	}

}

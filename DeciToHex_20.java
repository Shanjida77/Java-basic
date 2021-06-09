package basic1;

import java.util.Scanner;

public class DeciToHex_20 {
	public static void main(String args[]) {

		String hexDec = "";
		char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

		Scanner in = new Scanner(System.in);
		System.out.print("Input Decimal number: ");
		int dec = in.nextInt();

		while (dec > 0) {
			int rem = dec % 16;
			hexDec += hex[rem];
			dec = dec / 16;
		}
		System.out.print("Hexadecimal number is : " + hexDec);
	}

}

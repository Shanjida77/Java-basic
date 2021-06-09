package basic1;

import java.util.Scanner;

public class BinToOct_24 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input Binary number: ");
		int bin = in.nextInt();

		int i = 1, j = 0, rem, dec = 0;
		int oct[] = new int[1000];

		while (bin > 0) {
			rem = bin % 10;
			dec += rem * i;
			i *= 2;
			bin /= 10;

		}
		i = 0;
		while (dec > 0) {
			oct[i] = dec % 16;
			dec = dec / 16;
			i++;
		}
		System.out.print("Octal value: ");
		for (j = i - 1; j >= 0; j--) {
			System.out.print(oct[j]);
		}
	}

}

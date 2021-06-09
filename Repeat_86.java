package basic1;

import java.util.Scanner;

public class Repeat_86 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int sum = 0;

		while (n != 1) {
			System.out.println(n);
			if (n % 2 == 0) {
				n = n / 2;
				sum += 1;
			} else {
				n = (3 * n + 1) / 2;
				sum += 1;
			}
		}
		System.out.println(sum);
	}

}

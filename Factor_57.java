package basic1;

import java.util.Scanner;

public class Factor_57 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input an integer: ");
		int sum = 0;
		int n = in.nextInt();
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				int f = n / i;
				if (i == f)
					sum += 2;
				else
					sum++;
			}
		}
		System.out.println(sum);
	}

}

package basic1;

public class prime_66 {
	public static void main(String args[]) {
		int i, n, count, sum = 0;

		for (n = 1; n <= 100; n++) {
			count = 0;
			for (i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0 && n != 1) {
				sum = sum + n;
			}
		}
		System.out.println("The Sum of first Prime Numbers = " + sum);
	}

}

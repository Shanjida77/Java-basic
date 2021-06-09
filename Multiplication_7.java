package basic1;

import java.util.Scanner;

public class Multiplication_7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input a number: ");
		int x = in.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(x + "x" + i + "=" + (x * i));
		}
	}

}

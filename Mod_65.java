package basic1;

import java.util.Scanner;

public class Mod_65 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the first number : ");
		int x = in.nextInt();
		System.out.print("Input the second number: ");
		int y = in.nextInt();

		int sum = 0, mod = 0;

		sum = x / y;
		mod = x - (sum * y);

		System.out.print(mod);
	}

}

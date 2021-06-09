package basic1;

import java.util.Scanner;

public class RevString_37 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input a String: ");
		char[] a = in.nextLine().toCharArray();

		for (int i = a.length - 1; i >= 0; i--)
			System.out.print(a[i]);
	}

}

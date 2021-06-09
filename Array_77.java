package basic1;

import java.util.Arrays;

public class Array_77 {
	public static void main(String args[]) {
		int a[] = { 50, -20, 0 };
		int b[] = { 5, -50, 10 };
		int c[] = { a[0], b[2] };

		System.out.println("Array1: " + Arrays.toString(a));
		System.out.println("Array2: " + Arrays.toString(b));
		System.out.println("New Array: " + Arrays.toString(c));

	}

}

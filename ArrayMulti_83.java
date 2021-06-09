package basic1;

import java.util.Arrays;

public class ArrayMulti_83 {
	public static void main(String args[]) {
		int a[] = { 1, 3, -5, 4 };
		int b[] = { 1, 4, -5, -2 };

		System.out.println("Array1: " + Arrays.toString(a));
		System.out.println("Array2: " + Arrays.toString(b));
		for (int i = 0; i < 4; i++) {
			int c = a[i] * b[i];
			System.out.print(c + " ");
		}

	}

}

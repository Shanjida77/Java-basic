package basic1;

import java.util.Arrays;

public class Array_79 {
	public static void main(String args[]) {
		int a[] = { 20, 30, 40 };
		int b[] = { a[1], a[2], a[0] };

		System.out.println("Original Array: " + Arrays.toString(a));
		System.out.println("Rotated Array: " + Arrays.toString(b));

	}

}

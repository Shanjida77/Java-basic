package basic1;

import java.util.Arrays;

public class Array_80 {
	public static void main(String args[]) {
		int a[] = { 4, 30, 40 };

		System.out.println("Original Array: " + Arrays.toString(a));
		int large = a[0];
		if (a[2] >= large) {
			large = a[2];
		}
		System.out.println("Larger value between first and last element: " + large);
	}
}

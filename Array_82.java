package basic1;

import java.util.Arrays;

public class Array_82 {
	public static void main(String args[]) {
		int a[] = { 20, 30, 40, 50, 67 };

		System.out.println("Original Array: " + Arrays.toString(a));
		int large = a[0];
		if (a[a.length - 1] >= large) {
			large = a[a.length - 1];
		}
		if (a[a.length / 2] >= large) {
			large = a[a.length / 2];
		}
		System.out.println("Larger value between first and last element: " + large);
	}

}

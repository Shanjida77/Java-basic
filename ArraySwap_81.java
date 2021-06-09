package basic1;

import java.util.Arrays;

public class ArraySwap_81 {
	public static void main(String args[]) {
		int a[] = { 4, 30, 40 };

		System.out.println("Original Array: " + Arrays.toString(a));
		int temp = a[0];
		a[0] = a[a.length - 1];
		a[a.length - 1] = temp;
		System.out.println("New array after swaping the first and last elements: " + Arrays.toString(a));
	}

}

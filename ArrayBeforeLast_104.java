package basic1;

import java.util.Arrays;

public class ArrayBeforeLast_104 {
	public static void main(String args[]) {
		int[] arr = { 11, 15, 13, 10, 45, 20, 33, 53 };

		int result = 0;
		System.out.println("Original Array: " + Arrays.toString(arr));

		int last = 0;
		while (arr[last] != 10)
			last++;

		int[] new_array = new int[last];
		for (int i = 0; i < last; i++) {
			new_array[i] = arr[i];
		}
		System.out.println("New Array: " + Arrays.toString(new_array));
	}

}

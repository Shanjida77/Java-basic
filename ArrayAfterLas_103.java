package basic1;

import java.util.Arrays;

public class ArrayAfterLas_103 {
	public static void main(String args[]) {
		int[] arr = { 11, 15, 13, 10, 45, 20, 33, 53 };

		int result = 0;
		System.out.println("Original Array: " + Arrays.toString(arr));

		int last = arr.length - 1;
		while (arr[last] != 10)
			last--;

		int[] new_array = new int[arr.length - 1 - last];
		for (int i = last + 1; i < arr.length; i++) {
			new_array[i - last - 1] = arr[i];
		}
		System.out.println("New Array: " + Arrays.toString(new_array));
	}

}

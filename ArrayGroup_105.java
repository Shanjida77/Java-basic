package basic1;

import java.util.Arrays;

public class ArrayGroup_105 {
	public static void main(String args[]) {
		int arr[] = { 10, 15, 20, 25, 14, 10, 15 };

		System.out.println("Original Array: " + Arrays.toString(arr));

		int result = 0;
		int l = 2;
		int start = 0;
		int end = arr.length - l;

		for (; l > 0; l--) {
			if (arr[start] != arr[end]) {
				result = 1;
			} else {
				start++;
				end++;
			}
		}
		if (result == 1) {
			System.out.println(String.valueOf(false));
		} else
			System.out.println(String.valueOf(true));
	}

}

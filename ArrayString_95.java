package basic1;

import java.util.Arrays;

public class ArrayString_95 {
	public static void main(String args[]) {
		int n = 5;
		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = String.valueOf(i);
		}
		System.out.println("Array: " + Arrays.toString(arr));
	}

}

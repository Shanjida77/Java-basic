package basic1;

import java.util.Arrays;

public class ArrayRearranceEvenOdd_94 {
	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5 };

		int even = 0, odd = 0;

		int i = 0;
		System.out.println("Given array: " + Arrays.toString(arr));
		while (i < arr.length && arr[i] % 2 == 0)
			i++;

		for (int j = i + 1; j < arr.length; j++) {
			if (arr[j] % 2 != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
		System.out.println("New array: " + Arrays.toString(arr));

	}
}

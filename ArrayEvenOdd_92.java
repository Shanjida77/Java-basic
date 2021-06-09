package basic1;

import java.util.Arrays;

public class ArrayEvenOdd_92 {
	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5 };

		int even = 0, odd = 0;
		System.out.println("Given array: " + Arrays.toString(arr));

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even++;
			} else
				odd++;
		}
		System.out.println("Number of even: " + even);
		System.out.println("Number of odd: " + odd);

	}

}

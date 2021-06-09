package basic1;

import java.util.Arrays;

public class ArraySameEO_93 {
	public static void main(String args[]) {
		int arr[] = { 10, 10, 2, 4, 20, 20 };

		System.out.println("Given array: " + Arrays.toString(arr));

		boolean found1010 = false;
		boolean found2020 = false;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 10 && arr[i + 1] == 10) {
				found1010 = true;
			} else if (arr[i] == 20 && arr[i + 1] == 20) {
				found2020 = true;
			}

		}
		System.out.println(String.valueOf(found1010 != found2020));

	}
}

package basic1;

import java.util.Arrays;

public class ArrayGrater_101 {
	public static void main(String args[]) {
		int[] arr = { 10, 11, 10, 30, 45, 20, 33, 53 };

		int result = 0, x = 0, y = 0;

		System.out.print("Original Array: " + Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 10)
				x++;
			if (arr[i] == 20)
				y++;
		}
		System.out.print("\n" + String.valueOf(x > y));
	}

}

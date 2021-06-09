package basic1;

public class ArrayAdjacent_99 {
	public static void main(String args[]) {
		int arr[] = { 10, 20, 10, 20, 40, 20, 50 };

		int result = 0, x = 20;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != x && arr[i + 1] != x) {
				result = 1;
			}
		}
		if (result == 0) {
			System.out.println(String.valueOf(true));
		} else {
			System.out.println(String.valueOf(false));
		}

	}

}

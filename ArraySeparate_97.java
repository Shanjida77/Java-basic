package basic1;

public class ArraySeparate_97 {
	public static void main(String args[]) {
		int arr[] = { 10, 20, 10, 50, 20, 13, 50 };

		boolean test = false;
		int result = 0, x = 10;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == x && arr[i + 1] == x) {
				System.out.println(String.valueOf(true));
				result = 1;
			}
			if (i <= arr.length - 3 && arr[i] == x && arr[i + 2] == x) {
				System.out.println(String.valueOf(true));
				result = 1;
			}
		}
		if (result == 0) {
			System.out.println(String.valueOf(false));
		}
	}

}

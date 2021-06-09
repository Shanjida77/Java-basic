package basic1;

public class ArraySpecific_98 {
	public static void main(String args[]) {
		int arr[] = { 10, 20, 10, 20, 40, 13, 20 };

		int count = 0, result = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == 20 && arr[i] == 20) {
				System.out.println(String.valueOf(true));
				result = 1;
			}
			if (arr[i] == 20) {
				count++;
			}
		}
		if (result == 0) {
			System.out.println(String.valueOf(count == 3));
		}
	}

}

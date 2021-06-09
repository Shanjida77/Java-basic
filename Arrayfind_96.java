package basic1;

public class Arrayfind_96 {
	public static void main(String args[]) {
		int arr[] = { 10, 5, 4, 20, 6, 7 };
		int result = 0;
		int i = 0;

		boolean found = false;

		for (i = 0; i < arr.length; i++) {
			if (arr[i] == 10) {
				found = true;
			}

			if (found && arr[i] == 20) {
				System.out.println(String.valueOf(true));
				result = 1;
			}
		}
		if (result == 0) {
			System.out.println(String.valueOf(false));
		}

		// System.out.println(arr[i] == 10 || found && arr[i] == 20);
	}

}

package basic1;

public class Array_76 {
	public static void main(String args[]) {
		int a[] = { 50, -20, 0, 30, 40, 60, 12 };
		int b[] = { 45, 20, 10, 20, 30, 50, 11 };

		if (a.length >= 2 && b.length > 2) {
			System.out.println(a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
		}

	}

}

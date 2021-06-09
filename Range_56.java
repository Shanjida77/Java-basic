package basic1;

public class Range_56 {
	public static void main(String args[]) {
		int count = 0;
		int x = 5, y = 20, p = 3;
		for (int i = x; i <= y; i++) {
			if (i % p == 0)
				count++;
		}
		System.out.println(count);
	}

}

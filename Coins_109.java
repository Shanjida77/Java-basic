package basic1;

public class Coins_109 {
	public static void main(String args[]) {
		int n = 20;
		int temp = 0;

		while (temp < n) {
			temp++;
			n -= temp;
			System.out.println(temp + " " + n);
		}
	}

}

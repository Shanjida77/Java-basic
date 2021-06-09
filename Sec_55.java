package basic1;

import java.util.Scanner;

public class Sec_55 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input seconds: ");
		int s = in.nextInt();

		int sec = s % 60;
		int hr = s / 3600;
		int min = sec % 60;

		System.out.println(hr + ":" + min + ":" + sec);

	}

}

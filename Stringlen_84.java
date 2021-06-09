package basic1;

public class Stringlen_84 {
	public static void main(String args[]) {
		String str = "Python";
		int len = 3;

		if (str.length() < len) {
			len = str.length();
		}
		System.out.print(str.substring(str.length() - 3) + str + str.substring(str.length() - 3));

	}

}

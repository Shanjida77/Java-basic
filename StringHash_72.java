package basic1;

public class StringHash_72 {
	public static void main(String args[]) {
		String str = "";

		if (str.length() >= 3) {
			System.out.println(str.substring(0, 3));
		} else if (str.length() == 1) {
			System.out.println((str.charAt(0) + "##"));
		} else {
			System.out.print("###");
		}

	}

}

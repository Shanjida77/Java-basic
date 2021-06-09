package basic1;

public class String_38 {

	public static void main(String[] args) {
		String str = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

		char[] ch = str.toCharArray();

		int letter = 0, space = 0, num = 0, other = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			} else if (Character.isSpaceChar(ch[i])) {
				space++;
			} else if (Character.isDigit(ch[i])) {
				num++;
			} else {
				other++;
			}

		}
		System.out.println("String is: " + str + "\nletter: " + letter + "\nspace: " + space + "\nnumber: " + num
				+ "\nother: " + other);

	}
}

package basic1;

import java.util.Scanner;

public class PolyArea_35 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input the number of sides on the polygon: ");
		double n = in.nextInt();

		System.out.print("Input the length of one of the sides: ");
		double s = in.nextInt();

		double area = (n * (s * s)) / (4 * Math.tan(Math.PI / n));
		System.out.println("The area of the polygon is: " + area);
	}

}

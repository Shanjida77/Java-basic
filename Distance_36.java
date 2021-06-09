package basic1;

import java.util.Scanner;

public class Distance_36 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		System.out.print("Input the latitude of coordinate1: ");
		double x1 = in.nextDouble();

		System.out.print("Input the longitude of coordinate1: ");
		double x2 = in.nextDouble();

		System.out.print("Input the latitude of coordinate2: ");
		double y1 = in.nextDouble();

		System.out.print("Input the longitude of coordinate2: ");
		double y2 = in.nextDouble();

		x1 = Math.toRadians(x1);
		x2 = Math.toRadians(x2);
		y1 = Math.toRadians(y1);
		y2 = Math.toRadians(y2);

		double earthradius = 6371.01;

		double d = earthradius
				* Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		System.out.println("The area of the polygon is: " + d);
	}

}

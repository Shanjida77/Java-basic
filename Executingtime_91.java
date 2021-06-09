package basic1;

public class Executingtime_91 {
	public static void main(String args[]) {
		long time = System.nanoTime();

		System.out.println("Numbers: ");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		long estimatedTime = System.nanoTime() - time;
		System.out.println("Time in nano:" + estimatedTime);
	}

}

package intro;

import java.util.Scanner;

public class intro {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double x = input.nextDouble();
		double y = input.nextDouble();

		if (x > 0 && y > 0) {
			System.out.println(1);
		}
		if (x > 0 && y < 0) {
			System.out.println(4);
		}
		if (x < 0 && y > 0) {
			System.out.println(2);
		}
		if (x < 0 && y < 0) {
			System.out.println(3);
		}

	} // END main

} // END helloworld

package metoder;

import java.util.Scanner;

public class metoder_exempel {

	public static void main(String[] args) {

		System.out.println(max(2, 2, 2));

	}

	public static int max(int a, int b, int c) {
		if (a >= b && a >= c) {
			return a;
		} else if (b >= a && b >= c) {
			return b;
		} else if (c >= a && c >= b) {
			return c;
		} else {
			return a; // spelar ingen roll
		}

	}

	public static String getName() {
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv ditt namn: ");
		String name = input.nextLine();
		return name;
	}

	public static String askQuestion(String q) {
		Scanner input = new Scanner(System.in);
		System.out.print(q);
		String ans = input.nextLine();
		return ans;
	}

	public static boolean isEven(int tal) {
		if (tal % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void test() {

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}

	}

}

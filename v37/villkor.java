import java.util.Scanner;

public class villkor {

	public static void main(String[] args) {

		boolean a = true;
		boolean b = true;
		boolean c = true;

		if (a) {
			System.out.println("a är true");
		}
		if (b) {
			System.out.println("b är true");
		}
		if (c) {
			System.out.println("c är true");
		}

		a = true;
		b = false;
		if (a && b) {
			System.out.println("a och b är sanna");
		}

		int siffra1 = 5;
		int siffra2 = 8;

		if (!(5 >= siffra1 && siffra2 > siffra1)) {
			System.out.println("sant");
		}

		Scanner input = new Scanner(System.in);

		System.out.println("Hur gammal är du?");
		int age = input.nextInt();

		if (age >= 20) {
			System.out.println("Du får handla på systemet");
		} else {
			System.out.println("Du är för liten");
		}

		double d = input.nextDouble();

		if (d > 1.234) {
			System.out.println("d är ett stort tal!");
		}

		int tal1 = 5;
		int tal2 = 1;
		int tal3 = 6;
		int tal4 = 7;
		int tal5 = 9;

		int summa = tal1 + tal2 + tal3 + tal4 + tal5; // 28
		double medel1 = summa / 5; // 5
		double medel2 = summa / 5.0; // 5.6

		System.out.println("Medel1: " + medel1);
		System.out.println("Medel2: " + medel2);

	}

}

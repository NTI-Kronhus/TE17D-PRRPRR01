
public class modulus {

	public static void main(String[] args) {

		// % == mod

		int a = 5 % 2; // a == 1
		int b = 25 % 4; // b == 1
		int c = 85 % 15; // c == 10
		int d = 77 % 5; // d == 2

		for (int i = 1; i <= 20; i++) {

			if (i % 5 == 0) {
				System.out.println("talet " + i + " är jämnt delbart med 5");
			}

		}

		int turn = 0;
		while (true) {
			turn++;
			System.out.println("Tur: " + turn);
			if (turn % 3 == 0) {
				System.out.println("Joakims tur");
			} else if (turn % 3 == 1) {
				System.out.println("Mtanus tur");
			} else if (turn % 3 == 2) {
				System.out.println("Linus tur");
			}
			System.out.println();
			if (turn == 20) {
				break;
			}
		}

		for (int i = 0; i < 500; i++) {
			// Skriv ut alla som slutar på 3

			if (i % 10 == 3) {
				System.out.println(i + " slutar på 3");
			}

		}

		for (int i = 0; i < 5000000; i++) {
			// Skriv ut alla som börjar på 3

			int temp = i;
			while (temp / 10 > 10) {
				temp = temp / 10;
			}

			if (temp / 10 == 3 || i == 3) {
				// System.out.println(i + " börjar på 3");
			}

		}

	}

}

package lektionsuppgifter.facit;

import java.util.Scanner;

public class upg3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tal = sc.nextInt();
		int summa = 0;
		int antal = 0;

		// Så länge det inskrivna talet INTE är 0
		while (tal != 0) {
			antal++;
			summa += tal;
			tal = sc.nextInt();
		}

		System.out.println("Summa: " + summa);
		System.out.println("Medel: " + (summa / antal));

	}

}

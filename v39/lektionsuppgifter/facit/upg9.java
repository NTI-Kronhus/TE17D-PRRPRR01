package lektionsuppgifter.facit;

import java.util.Scanner;

public class upg9 {

	public static void main(String[] args) {

		for (int a = 1; a <= 10; a++) {

			for (int b = 1; b <= 10; b++) {

				int prod = a * b;
				if (prod < 10) {
					// ental kräver 2 mellanrum för snygg utskrift
					System.out.print(prod + "  ");
				} else {
					System.out.print(prod + " ");
				}

			}

			System.out.println(); // ny rad

		}

	}

}

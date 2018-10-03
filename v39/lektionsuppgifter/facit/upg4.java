package lektionsuppgifter.facit;

import java.util.Scanner;

public class upg4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int produkt = 1;
		int antal_tal = 0;
		int tal = sc.nextInt();
		
		// Fortsätt så länge produkten är under 100 000 och antal tal är udner 10
		while (produkt <= 100000 && antal_tal < 10) {
			antal_tal++;
			produkt = produkt * tal;
			tal = sc.nextInt();
		}

		System.out.println("Produkt:" + produkt);
		System.out.println("Antal tal: " + antal_tal);

	}

}

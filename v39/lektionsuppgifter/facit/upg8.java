package lektionsuppgifter.facit;

import java.util.Scanner;

public class upg8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Timmar ? ");
		int h = sc.nextInt();

		System.out.print("Minuter ? ");
		int m = sc.nextInt();

		System.out.print("Sekunder ? ");
		int s = sc.nextInt();

		int tot = h * 60 * 60 + m * 60 + s;

		System.out.println("Antal sekunder: " + tot);
	}

}

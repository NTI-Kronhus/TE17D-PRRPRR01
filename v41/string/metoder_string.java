package string;

import java.util.Scanner;

public class metoder_string {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		// J�MF�RA STR�NGAR ANV�ND .euqals();
		if (str.equals("Hej")) {
			System.out.println("HEJ");
		} else {
			System.out.println(str);
		}

		// Loopa igenom alla tecken i en String
		int length = str.length();
		for (int i = 0; i < length; i++) {
			System.out.println("INDEX " + i + ": " + str.charAt(i));
		}

		// Delstr�ng mellan tv� index
		System.out.println(str.substring(0, str.length() - 3));

		// Replace antingen tecken eller hela str�ngar
		System.out.println(str.replace('j', 'o'));
		System.out.println(str.replace("joak", ""));

		// G�r alla tecken till stora eller sm� bokst�ver
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

		// J�mf�ra med stora/sm� bokst�ver
		if (str.toLowerCase().equals("jaok")) {
			System.out.println("JAAAOOK");
		}
		if (str.toUpperCase().contains("JAOK")) {
			System.out.println("JAAAOOK123");
		}

		String space = "  hEj  ";
		// .trim() tar bort alla mellanslag i b�rjan och slutet
		if (space.trim().toLowerCase().equals("hej")) {
			System.out.println("HEJ P� DIG");
		}

		// Kolla f�rsta tecknet
		if (str.charAt(0) == 'J' || str.charAt(0) == 'j') {
			System.out.println("DU b�RJAR P� J");
		}

		// G�r f�rsta bokstaven stor
		String firstUpper = str.substring(0, 1).toUpperCase() + str.substring(1, str.length());
		System.out.println(firstUpper);

	}

}

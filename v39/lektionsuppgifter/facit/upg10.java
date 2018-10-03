package lektionsuppgifter.facit;

import java.util.Scanner;

public class upg10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Bas ? ");
		int bas = sc.nextInt();

		for (int i = 0; i < bas; i++) {
			for (int j = 1; j < bas - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("X ");
			}
			System.out.println();
		}
	}
}

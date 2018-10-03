package lektionsuppgifter.facit;

import java.util.Scanner;

public class upg7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Storlek ? ");
		int size = sc.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.print("$");
			for (int j = 0; j < size - 2; j++) {
				if (i == 0 || i == size - 1) {
					System.out.print("$");
				} else {
					System.out.print(" ");
				}
			}
			if (size != 1) {
				System.out.println("$");
			}
		}
	}

}

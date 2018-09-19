package uppgift;

import java.util.Scanner;

public class facit_v37 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int summa = 0;
		for (int i = 0; i < 10; i++) {
			int tal = input.nextInt();
			summa = summa + tal;
			if (tal < min) {
				min = tal;
			}
			if (tal > max) {
				max = tal;
			}
		}
		System.out.println("MIN: " + min);
		System.out.println("MAX: " + max);
		System.out.println("MEDEL: " + summa / 10.0);
	}

}

package lektionsuppgifter.facit;
import java.util.Scanner;

public class upg2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 

		int tal = input.nextInt(); // 1066
		int summa = 0;

		while (tal != 0) {
			int ental = tal % 10; // 6
			summa = summa + ental; // 6
			tal = tal - ental; // 1060
			tal = tal / 10; // 106
		}
		System.out.println(summa);

	}

}

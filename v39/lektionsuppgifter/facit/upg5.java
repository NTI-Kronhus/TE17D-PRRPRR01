package lektionsuppgifter.facit;

public class upg5 {

	public static void main(String[] args) {

		int summa = 0;
		for (int i = 1; i < 10000; i++) {
			if (i % 7 == 0) {
				summa += i;
			}
		}

		System.out.println("Summa: " + summa);

	}

}

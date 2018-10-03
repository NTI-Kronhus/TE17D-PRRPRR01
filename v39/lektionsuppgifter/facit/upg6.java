package lektionsuppgifter.facit;

import java.util.Scanner;

public class upg6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Skriv in en radie: ");
		double r = sc.nextDouble();

		System.out.print("Skriv in en höjd: ");
		double h = sc.nextDouble();

		double v = Math.PI * r * r * h;
		System.out.println("Volym: " + v);

	}

}

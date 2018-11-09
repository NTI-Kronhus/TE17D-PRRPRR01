package arrayer;

import java.util.Scanner;

public class Arrayer {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int[] inputs = new int[10];

		// värdet på första elementet blir 5
		inputs[0] = 5;
		inputs[1] = 50;
		inputs[2] = 4;
		inputs[3] = 4;
		inputs[4] = 4;
		inputs[5] = 4;
		inputs[6] = 4;
		inputs[7] = 4;
		inputs[8] = 4;
		inputs[9] = 4;

		// Fyll en array med siffror från 1- längden
		for (int i = 0; i < inputs.length; i++) {
			inputs[i] = i + 1;
			System.out.println(inputs[i]);
		}

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < inputs.length; i++) {
			// inputs[i] = sc.nextInt();
		}

		// Skriv ut på en rad
		for (int i = 0; i < inputs.length; i++) {
			System.out.print(inputs[i] + ",");
		}

		int summa = 0;
		// Summera alla tal
		for (int i = 0; i < inputs.length; i++) {
			summa = summa + inputs[i];
		}
		System.out.println("summa: " + summa);

		String[] names = { "Joakim", "Mtanus", "Abdi", "Ludvig" };

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < names.length; j++) {
				System.out.println("Tur " + (j + 1 + i * 4) + " : " + names[j]);
			}
		}

		System.out.println();
		for (int j = 0; j < 10; j++) {
			System.out.println("Tur " + (j * 4 + 1) + " : " + names[0]);
			System.out.println("Tur " + (j * 4 + 2) + " : " + names[1]);
			System.out.println("Tur " + (j * 4 + 3) + " : " + names[2]);
			System.out.println("Tur " + (j * 4 + 4) + " : " + names[3]);
			System.out.println();
		}

		System.out.println();
		for (int j = 0; j < 40; j++) {
			System.out.println("Tur " + (j + 1) + " : " + names[j % names.length]);
		}
		
		//Sökning efter Abdi
		for (int i = 0; i < names.length; i++) {
			if(names[i].equals("Abdi")){
				System.out.println("Abdi finns på index: " + i + "(plats " + (i+1) + ")");
			}	

		}
		
	}

}

package lektionsuppgifter.facit;

import java.util.Scanner;

public class upg1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// L�s in tv� heltal
		int tal1 = sc.nextInt();
		int tal2 = sc.nextInt();
		
		// J�mf�r vilken som �r minst.
		if(tal1 < tal2){
			System.out.println(tal1);
		}
		else{
			System.out.println(tal2);
		}
		
	}

}

package kattis;

import java.util.Scanner;

public class twostones {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		if(n % 2 == 0){
			System.out.println("Bob");
		}
		else{
			System.out.println("Alice");
		}
		
	}

}

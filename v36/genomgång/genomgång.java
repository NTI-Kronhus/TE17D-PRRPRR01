package genomgång;

import java.util.Scanner;

public class genomgång {

	public static void main(String[] args) {
		
		int tal = 23;
		double decimal = 123.456;
		
		decimal = 50;
		tal = 50;
		
		String Joakim = "hej!";
		String namn = Joakim;
		String str = new String("str");
				
		char c1 = 'c';
		char c2 = 'j';
		
		boolean b1 = true;
		boolean b2 = false;	
		
		if(b1){
			System.out.println("b1 är sann");			
		}
		else if(b1){
			
		}
		else if(b1){
			
		}
		else{
			System.out.println("b1 är INTE sann");
		}
		
		if(tal == 50){
			System.out.println(tal*50);
		}
		
		Scanner input = new Scanner(System.in);

		String rad1 = input.nextLine();
		String rad2 = input.nextLine();
		String rad3 = input.nextLine();
		String rad4 = input.nextLine();
				
		System.out.println(rad1 +" konkatenera "+ rad2 + rad3 + rad4);
		
		System.out.print("hej\n");
		System.out.println("hej"); // Lägger på \n automatiskt
		
	}
	
}

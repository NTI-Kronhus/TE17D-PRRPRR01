package loopar;

import java.util.Scanner;

// Jämför före iteration
public class while_loop {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean exit = false;
		while(!exit){
			String line = input.nextLine();	
			if(line.equals("exit")){
				exit = true;
			}
		}
		
		
		
	}

}

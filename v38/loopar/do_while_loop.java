package loopar;

import java.util.Scanner;

// Jämför efter en iteration
public class do_while_loop {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean exit = false;
		do {
			String line = input.nextLine();
			if (line.equals("exit")) {
				exit = true;
			}
		}
		while (!exit); 

	}

}

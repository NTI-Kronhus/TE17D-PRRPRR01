
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class fil {

	String[] ord = { "jacka", "skoter", "skor", "mus", "dator" };

	public static void main(String[] args) {

		try {
			Scanner file_reader = new Scanner(new File("w12/words.txt"));
			while (file_reader.hasNextLine()) {
				System.out.println(file_reader.nextLine());
			}
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
		}

	}

}

package uppgift;

public class facit_v41 {

	public static double volume(double r) {
		return r * r * r * Math.PI * 4 / 3;
	}

	public static String reverse(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i++)
			rev += str.charAt(i);
		return rev;
	}

	public static int count(String str, char c) {
		int n = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c)
				n++;
		}
		return n;
	}

	public static String sjorovare(String str) {
		str = str.toLowerCase();
		String sjo = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'b' || c == 'c' || c == 'd' || c == 'f' || c == 'g' || c == 'h' || c == 'j' || c == 'k' || c == 'l'
					|| c == 'm' || c == 'n' || c == 'p' || c == 'q' || c == 'r' || c == 's' || c == 't' || c == 'v'
					|| c == 'w' || c == 'x' || c == 'z')
				sjo += c + 'o' + c;
			else
				sjo += c;
		}
		return sjo;
	}

}

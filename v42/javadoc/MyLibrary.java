package javadoc;

public class MyLibrary {
	
	/**
	 * Denna metod skriver enbart ut <br> texten hej till konsolen.
	 */
	public static void hej(){
		System.out.println("hej");
	}
	
	/**
	 * Denna metod tar in två tal och ger tillbaka det minsta.
	 * @param a ett tal
	 * @param b ett tal
	 * @return det minsta av a och b
	 */
	public static double min(double a, double b){
		if(a < b){ 
			return a; 
		}
		else{ 
			return b; 
		}
	}

	
}

import java.util.Scanner;

public class LabSix {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
	String input;
	
	
	System.out.println("Type in a sentence, do not use numbers");
	input = scan.nextLine();
	//convertToLatin(input);
	
	if(input.charAt(0) == 'a' || input.charAt(0) == 'e' || input.charAt(0) == 'i' || input.charAt(0) == 'o'|| input.charAt(0) == 'u') {
		System.out.println(pigLat(input));

	}
	else {
	
	System.out.println(convertToLatin(input));
	
	}
	
	//lowCase(input);
	//pigLat(input);
	
	
	}
	
	public static String lowCase(String input) {
		Scanner scnr = new Scanner(System.in);
		
		//String input;
//		System.out.println("TYPE A WORD");
//		input = scnr.nextLine();
		System.out.println(input.toLowerCase());

		return ""; 
	}

	public static String pigLat(String input) {
		input = input.toLowerCase();
		
		if(input.charAt(0) == 'a' || input.charAt(0) == 'e' || input.charAt(0) == 'i' || input.charAt(0) == 'o'|| input.charAt(0) == 'u') {
			System.out.println(input + "way");
		}
		
		return "";
	}
	
	public static String convertToLatin(String pString) {
		String end = "";
		String space = "//s+";
		String[] words = pString.split(space);
		for( int i = 0; i < words.length; i ++) {
			if(isVowel(words[i].charAt(0))) {
			end += words[i] + "ay";
			
			
			}
			else {
				end += words[i].substring(1) + words[i].substring(0, 1) + "ay";
				
			}
			
		}
		return end;
	}
	
	public static boolean isVowel(char c) {
		if (c == 'a')
			return true;
		if (c == 'e')
			return true;
		if (c == 'i')
			return true;
		if (c == 'o')
			return true;
		if (c == 'u')
			return true;
		return false;
	}
	
}

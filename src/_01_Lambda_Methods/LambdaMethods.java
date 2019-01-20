package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustomMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			String print = "";
			for (int i = 0; i < s.length(); i++) {
				print+=s.substring(s.length()-i-1, s.length()-i);
			}
			System.out.println(print);
		}, "backwards");
		
		//3. Call the printCustomMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			String print = "";
			for (int i = 0; i < s.length(); i++) {
				if(i%2==0) {
				print+=s.substring(i, i+1).toUpperCase();
				}
				if(i%2==1) {
				print+=s.substring(i, i+1).toLowerCase();
				}
			}
			System.out.println(print);
		}, "upperandlowercase");

		
		//4. Call the printCustomMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String print = "";
			for (int i = 0; i < s.length(); i++) {
				if(i!=s.length()-1) {
				print+=s.substring(i, i+1);
				print+=".";
				}
				else{
					print+=s.substring(i, i+1);
				}
				
			}
			System.out.println(print);
		}, "PeriodsEverywhere");
		
		//5. Call the printCustomMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String print = "";
			for (int i = 0; i < s.length(); i++) {
				char[] charmeme = s.substring(i, i+1).toLowerCase().toCharArray();
				if(charmeme[0]!=97 && charmeme[0]!=101 && charmeme[0]!=105 && charmeme[0]!=111 && charmeme[0]!=117) {
				print+=s.substring(i, i+1);
				}
				
			}
			System.out.println(print);
		}, "NoVowelsHere");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	

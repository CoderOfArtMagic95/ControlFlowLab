//import java.util.Formatter;// to use ASCII values

public class AsciiChars {
	//Formatter create = new Formatter();
	public static void printNumbers() {
		for(int i = 48;i <= 71; i++) {
			System.out.format("` Equals %c ${num}");
		}
	}
    public static void printLowerCase(char upperCase) {
    	for(int i = 97;i <= 122; i++) {
    		System.out.format("`Equals  %c ${upperCase}");
		}
	}
	
    public static void printUpperCase(char lowerCase) {
    	for(int i = 65;i <= 90; i++) {
    		System.out.format("`Equals  %c ${lowerCase}");
		}
    }
}

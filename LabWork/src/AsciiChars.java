//import java.util.List;
import java.util.Scanner;
//import java.util.ArrayList;

//YOU STILL NEED TO FINISH SOME MORE PLEASE LOOK BACK AT VS CODE FOR INSTRUCTIONS
public class AsciiChars {
	//static List<Integer> numbers = new ArrayList<Integer>();
	public static void printNumbers() {//fixed
		for(int num = 0; num <= 256; num++) {
           System.out.println("ASCII value: " + (char)num);// casts integer to char
        }
	}
    public static void printLowerCase(String s) {
    	s.toLowerCase();
	    System.out.println("From UpperCase to LowerCase! Shazam!: " + s);
	}
	
    public static void printUpperCase(String s) {
    	s.toUpperCase();
		System.out.println("From lowerCase to UpperCase! Shazam!: " + s);
    }
    
    public static void main(String[] args) {
    	Scanner ascii = new Scanner(System.in);
    	System.out.println("Print an uppercase letter: ");
    	String input = ascii.nextLine();
    	
    	System.out.println("Print a lowercase letter: ");
    	String input2 = ascii.nextLine();
    	
    	System.out.println("Want to know the ASCII numbers? (yes/no)");
    	String input3 = ascii.nextLine();
    
    	ascii.close();
    	
    	//static classes and methods are called this way because static keyword makes it unable to create objects;	
        AsciiChars.printLowerCase(input.toLowerCase());
        System.out.println();
        AsciiChars.printUpperCase(input2.toUpperCase());
        System.out.println();
        
        if(input3.equals("yes")) {
        	AsciiChars.printNumbers();	
        }else {
        	System.out.println("Good Day to ya!");
        }
        

    }
}

import java.util.Random;
import java.util.Scanner;

public class FlowLab {
	
	public static void checkForDuplicates(int newMagicBall,int thirdIndex, int lastDigits,int randomPick,int firstName, int sum) {
       
		//Try to fix duplicates issues and sort the numbers later
		
		boolean compare1 = (newMagicBall == thirdIndex);
		boolean compare2 = (newMagicBall == lastDigits);
		boolean compare3 = (newMagicBall == randomPick);
		boolean compare4 = (newMagicBall == firstName);
		boolean compare5 = (newMagicBall == sum);
		
		boolean compare6 = (thirdIndex == lastDigits);
		boolean compare7 = (thirdIndex == firstName);
		boolean compare8 = (thirdIndex == randomPick);
		boolean compare9 = (thirdIndex == sum);
		
		boolean compare10 = (lastDigits == firstName);
		boolean compare11 = (lastDigits == randomPick);
		boolean compare12 = (lastDigits == sum);
		
		boolean compare13 = (firstName == randomPick);
		boolean compare14 = (firstName == sum);
		
		boolean compare15 = (randomPick == sum);
		
		if(compare1 == true || compare2 == true || compare3 == true || compare4 == true || compare5 == true) {
			newMagicBall += 2;
			
			while(newMagicBall > 75) {
	    		newMagicBall = newMagicBall - 75;
	    		newMagicBall--;
    		}//end of while loop
	    }//end of if statement
	    	
		if(compare6 == true || compare7 == true || compare8 == true || compare9 == true || compare10 == true) {
			thirdIndex += 2;
			
			while(thirdIndex > 65) {
				thirdIndex = thirdIndex - 65;
				thirdIndex--;
    		}//end of while loop
    	}//end of if statement
		if(compare11 == true || compare12 == true || compare13 == true || compare14 == true || compare15 == true) {
			lastDigits += 2;
			firstName += 2;
			randomPick += 2;
			
			while(thirdIndex > 65 || firstName > 65 || randomPick > 65) {
				thirdIndex = thirdIndex - 65;
				thirdIndex--;
				
				firstName = firstName - 65;
				firstName--;
				
				randomPick = randomPick - 65;
				randomPick--;
    		}//end of while loop
		}//end of if statement
	}//end of checkForDuplicates method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter your name");
	String input = scan.nextLine();
	
	System.out.println("Do you wish to continue(input 'yes' , 'y', or enter key to exit + enter)");
	String input2 = scan.nextLine();
	
	Random ran = new Random();
	
	Random magicBall = new Random();
	
	//for switch case 2
	int newMagicBall = 0;
	
	//for switch case 1
	char thirdLetter;
	int  thirdIndex = 0;
	
	//for switch case 	3
	char carYearDigits; 
	int lastDigits = 0;
	
	//for switch case 5
	int randomPick;
	
	//for switch case 4
	int firstName = 0;
	
	//for switch key
	int keyQuestions = 5;
	
	if(input2.equals("yes") || input2.equals("y")) {
	
		/*I have edited my code by getting rid of cases, break statements, and added a 
		 * default in the switch so it goes to all questions to get the lottery numbers*/
		switch(keyQuestions) { 
		  
		    default:
		    	System.out.println("What's your favorite pet's name?: ");
		    	String answer1 = scan.nextLine();
		    	thirdLetter = answer1.charAt(2);
		    	thirdIndex = (int)thirdLetter * ran.nextInt(65);
		    	
		    	while(thirdIndex > 65) {
		    		thirdIndex = thirdIndex - 65;
		    		thirdIndex--;
	    		}//end of while loop
		    	
		    	System.out.println("What's your lucky number?: ");
		    	String answer2 = scan.nextLine(); 
		    	newMagicBall = magicBall.nextInt(75) * Integer.parseInt(answer2);
		    	while(newMagicBall > 75) {
		    		newMagicBall = newMagicBall - 75;
		    		newMagicBall--;
	    		}//end of while loop
		    	
		    	System.out.println("What's is the model year of your car?: ");
		    	String answer3 = scan.nextLine();
		    	carYearDigits = (char) (answer3.charAt(2) + (char) (answer3.charAt(3))) ;
		    	lastDigits = (int)carYearDigits * ran.nextInt(65);
		    	while(lastDigits > 65) {
		    		lastDigits = lastDigits - 65;
		    		lastDigits--;
	    		}//end of while loop 
		    
		    	System.out.println("What is the first name of your favorite actor or actress?: ");
		    	String answer4 = scan.nextLine();
		    	
		    	firstName = answer4.charAt(0) + answer4.charAt(answer4.length() - 1);
		    	firstName = firstName * ran.nextInt(65);
		    	
		    	while(firstName > 65) {
		    		firstName = firstName - 65;
		    		firstName--;
	    		}//end of while loop
		    	
		    
		    	System.out.println("Enter a random number between 1 and 50: ");
		    	String answer5 = scan.nextLine(); 
		    	
		    	randomPick = answer5.charAt(0);
		    	randomPick = randomPick * ran.nextInt(65);
		    	
		    	while(randomPick > 65) {
		    		randomPick = randomPick - 65;
		    		randomPick--;
	    		}//end of while loop
		    	
		    	int sum = thirdIndex + lastDigits;// adds case 2 and 5 info 
		    	while(sum > 65) {
		    		sum = sum - 65;
		    		sum--;
	    		}//end of while loop
		    	
		    	if(answer5 != null) {
		    		checkForDuplicates(newMagicBall, thirdIndex,
		    				lastDigits,randomPick,firstName, sum);
		    		System.out.println("Thanks " + input + ", here's your lotto ticket!");
		    		System.out.println( "MagicBall: " + newMagicBall + " "  + " " + " Your Lotto Numbers: " 
		    		+ thirdIndex + ", "+ lastDigits + ", "+ firstName + ", " 
		 		    + randomPick + ", " + sum);
		    	}
		    	break;
		}//end of switch statement
	}else {
		System.out.println("Please return later to complete the survey! Have a nice day");
	}
	scan.close();
	}//end of main method

}//end of ControlFlow Class

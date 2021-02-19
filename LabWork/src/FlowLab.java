import java.util.Random;
import java.util.Scanner;

public class FlowLab {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter your name");
	String input = scan.nextLine();
	
	System.out.println("Do you wish to continue(input 'yes' or 'y')");
	String input2 = scan.nextLine();
	
	Random ran = new Random();
	
	Random ran1 = new Random();
	
	Random ran2 = new Random();
	
	Random ran3 = new Random();
	
	Random ran4 = new Random();
	
	Random ran5 = new Random();
	
	Random ran6 = new Random();
	
	Random magicBall = new Random();
	
	if(input2.equals("yes") || input2.equals( "y")) {
	
		switch(ran.nextInt(7)) {
		    case 1:
		    	System.out.println("Do you have a red car? (yes, no): ");
		    	String answer1 = scan.nextLine(); 
		    	if(answer1 != null) {
		    		System.out.println("Thanks " + input + ", here's your lotto ticket!");
		    		System.out.println("Your Lotto Numbers: " + ran1.nextInt(65) + ", " 
		    	    + ran2.nextInt(65) + ", "+ ran3.nextInt(65) + ", "+ ran4.nextInt(65) + ", " 
		    		+ ran5.nextInt(65) + ", "+ ran6.nextInt(65) + ", " + magicBall.nextInt(65));
		    	}
		    	break;
		    case 2:
		    	System.out.println("What's your favorite pet's name?: ");
		    	String answer2 = scan.nextLine();
		    	if(answer2 != null) {
		    		System.out.println("Thanks " + input + ", here's your lotto ticket!");
		    		System.out.println("Your Lotto Numbers: " + ran1.nextInt(65) + ", " 
				    	    + ran2.nextInt(65) + ", "+ ran3.nextInt(65) + ", "+ ran4.nextInt(65) + ", " 
				    		+ ran5.nextInt(65) + ", "+ ran6.nextInt(65) + ", " + magicBall.nextInt(65));
		    	}
		    	break;
		    case 3:
		    	System.out.println("What's your lucky number?: ");
		    	String answer3 = scan.nextLine(); 
		    	if(answer3 != null) {
		    		System.out.println("Thanks " + input + ", here's your lotto ticket!");
		    		System.out.println("Your Lotto Numbers: " + ran1.nextInt(65) + ", " 
				    	    + ran2.nextInt(65) + ", "+ ran3.nextInt(65) + ", "+ ran4.nextInt(65) + ", " 
				    		+ ran5.nextInt(65) + ", "+ ran6.nextInt(65) + ", " + magicBall.nextInt(65));
		    	}
		    	break;
		    case 4:
		    	System.out.println("Do you have a favorite quarterback? If so whar is their jersey number?: ");
		    	String answer4 = scan.nextLine(); 
		    	if(answer4 != null) {
		    		System.out.println("Thanks " + input + ", here's your lotto ticket!");
		    		System.out.println("Your Lotto Numbers: " + ran1.nextInt(65) + ", " 
				    	    + ran2.nextInt(65) + ", "+ ran3.nextInt(65) + ", "+ ran4.nextInt(65) + ", " 
				    		+ ran5.nextInt(65) + ", "+ ran6.nextInt(65) + ", " + magicBall.nextInt(65));
		    	}
		    	break;
		    case 5:
		    	System.out.println("What's is the model year of your car?: ");
		    	String answer5 = scan.nextLine();
		    	if(answer5 != null) {
		    		System.out.println("Thanks " + input + ", here's your lotto ticket!");
		    		System.out.println("Your Lotto Numbers: " + ran1.nextInt(65) + ", " 
				    	    + ran2.nextInt(65) + ", "+ ran3.nextInt(65) + ", "+ ran4.nextInt(65) + ", " 
				    		+ ran5.nextInt(65) + ", "+ ran6.nextInt(65) + ", " + magicBall.nextInt(65));
		    	}
		    	break;
		    case 6:
		    	System.out.println("What is the first name of your favorite actor or actress?: ");
		    	String answer6 = scan.nextLine();
		    	if(answer6 != null) {
		    		System.out.println("Thanks " + input + ", here's your lotto ticket!");
		    		System.out.println("Your Lotto Numbers: " + ran1.nextInt(65) + ", " 
				    	    + ran2.nextInt(65) + ", "+ ran3.nextInt(65) + ", "+ ran4.nextInt(65) + ", " 
				    		+ ran5.nextInt(65) + ", "+ ran6.nextInt(65) + ", " + magicBall.nextInt(65));
		    	}
		    	break;
		    case 7:
		    	System.out.println("Enter a random number between 1 and 50: ");
		    	String answer7 = scan.nextLine(); 
		    	if(answer7 != null) {
		    		System.out.println("Thanks " + input + ", here's your lotto ticket!");
		    		System.out.println("Your Lotto Numbers: " + ran1.nextInt(65) + ", " 
				    	    + ran2.nextInt(65) + ", "+ ran3.nextInt(65) + ", "+ ran4.nextInt(65) + ", " 
				    		+ ran5.nextInt(65) + ", "+ ran6.nextInt(65) + ", " + magicBall.nextInt(65));
		    	}
		    	break;
		}//end of switch statement
	}else {
		System.out.println("Please return later to complete the survey! Have a nice day");
	}
	scan.close();
	
	
	}//end of main method

}//end of ControlFlow Class

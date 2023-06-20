package package_June12;

import java.util.Scanner;

import java.util.Random;

public class MyAssignment03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		String firstName = "";
		String lastName = "";
		int age = 0;
		int int_random = 0;
		int guessNumber = 0;
		
		System.out.println("Please Enter your first name:");
		firstName = kb.next();
		
		System.out.println("Please Enter your last name:");
		lastName = kb.next();
		
		System.out.println("Please Enter your age:");
		age = kb.nextInt();
		
		System.out.printf("Hello: %s, you have %d years old; nice to meet you!%n",lastName, age);
		
		Random rand = new Random(); 
	      
	    int upperbound = 50;
	     
	    int_random = 1 + rand.nextInt(upperbound);
	      
	    System.out.println("Please guess a number between 1 and 50:"); 
	    guessNumber = kb.nextInt();
	    
	    while (int_random != guessNumber)
	    {
	    	if ( guessNumber > int_random )
	    	{
	    		System.out.println("Choose a smaller one, you were unlucky:"); 
	    		guessNumber = kb.nextInt();
	    	}
	    	else
	    	{
	    		System.out.println("Choose a bigger one, you were unlucky:");
	    		guessNumber = kb.nextInt();
	    	}	
	    }
	    
	    System.out.println("You are lucky");
		
		kb.close();
	}

}

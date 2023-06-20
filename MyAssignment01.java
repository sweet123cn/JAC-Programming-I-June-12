package package_June12;

import java.util.Random;

public class MyAssignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(); 
	      
	      int upperbound = 12;
	     
	      int int_random = 1 + rand.nextInt(upperbound);
	      
	      String monthName = "";
	      
	      System.out.println("Random month number between 1 to 12 :" + int_random);
	      
	      switch ( int_random ) {
			case 1:
				monthName = "January";
				break;
			case 2:
				monthName = "February";
				break;
			case 3:
				monthName = "March";
				break;
			case 4:
				monthName = "April";
				break;
			case 5:
				monthName = "May";
				break;
			case 6:
				monthName = "June";
				break;
			case 7:
				monthName = "July";
				break;
			case 8:
				monthName = "August";
				break;
			case 9:
				monthName = "September";
				break;
			case 10:
				monthName = "October";
				break;
			case 11:
				monthName = "November";
				break;
			case 12:
				monthName = "December";
				break;	
			default:
				monthName = "error";
				break;
					
			}
			
			System.out.println("the month name is: " + monthName);
	      
	}

}

package package_June12;

import java.util.Scanner;

public class MyAssignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		
		int monthNum = 0;
		
		int yearNum = 0;
		
		String monthName  = "";
		
		int monthDays = 0;

        
		do
		{
			System.out.println("Please inut a month number between 1 and 12 :");
			monthNum = kb.nextInt();
			
		}while( monthNum <1 || monthNum >12 );
		
		System.out.println("Please inut a integer year number :");
		yearNum = kb.nextInt();
		
		boolean leapyear = false;
		
		// check the year is leap year or not
		if (((yearNum % 4 == 0)&&( yearNum % 100 != 0)) || (yearNum % 400 == 0) )
		{
			leapyear = true;
		}
		
		//convert month number to month name and calculate the days of a month
		switch ( monthNum ) {
		case 1:
			monthName = "January";
			monthDays = 31;
			break;
		case 2:
			monthName = "February";
			monthDays = (leapyear) ? 29 : 28;
			break;
		case 3:
			monthName = "March";
			monthDays = 31;
			break;
		case 4:
			monthName = "April";
			monthDays = 30;
			break;
		case 5:
			monthName = "May";
			monthDays = 31;
			break;
		case 6:
			monthName = "June";
			monthDays = 30;
			break;
		case 7:
			monthName = "July";
			monthDays = 31;
			break;
		case 8:
			monthName = "August";
			monthDays = 31;
			break;
		case 9:
			monthName = "September";
			monthDays = 30;
			break;
		case 10:
			monthName = "October";
			monthDays = 31;
			break;
		case 11:
			monthName = "November";
			monthDays = 30;
			break;
		case 12:
			monthName = "December";
			monthDays = 31;
			break;	
		default:
			monthName = "error";
			break;
		}
		
		System.out.println(monthName + " " + yearNum + " " + "has " + monthDays + " days");  
        
        kb.close();
	}	
}

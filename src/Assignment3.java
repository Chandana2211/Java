/*
Write a Java program to convert minutes into a number of years and days.
 */
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long minute=14444444L;
		long minuteYear=0L;
		int minuteDay=0;
		int year=0,days=0,min=0, rem=0;
		
		minuteYear=365*24*60;
		minuteDay=24*60;
		
		year=(int)(minute/minuteYear);
		rem= (int)(minute%minuteYear);
		days=rem/minuteDay;
		rem=rem%minuteDay;
		min=rem;
		
		System.out.println("Year :"+ year + "    Days :" + days + "    min :"+min);
			
			
			
		}

	}



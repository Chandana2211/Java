/*
 Write a program that will accept a 4 digit number(assume that the user enters only 4 digit nos.)
and print the sum of all the 4 digits. For ex : If the number passed is 3629, the program should
print “The sum of all the digits entered is 20”

 */

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner myScan = new Scanner(System.in);
	int input= myScan.nextInt();
	myScan.close();
	
	int sum=0,temp,rem=0;
	
	temp=input;
	
	while(input>0) {
	rem=input%10;
	sum=sum+rem;
	input= input/10;
	}
	
	
	System.out.println("The sum of all the digits entered number "+ temp + " is "+ sum );
		

	}

}

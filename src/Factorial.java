/*
 *Assignment 7:
Write a Java program to calculate the factorial of a number without using any loop.
 */



public class Factorial {

	public static int calFact(int n) {
		if(n==0)
			return 1;
		if(n>0) {
			
			return n*calFact(n-1);
		}
		//if given Number is negative
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=6;
		int fact=0;
		
		fact=calFact(input);
		
		System.out.println(fact);

	}

}

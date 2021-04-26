/*
Assignment 2:

Write a Java program to print the result of the following operations. Declare variables and
initialize them with given values
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3

 */
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int e=2,f=3,g=5,h=6,i=8,j=9,k=15,l=20,m=55;
		int a,b,c,d=0;
		
		a=-g+i*h;
		b=(m+j)%j;
		c=l-f*g/i;
		d=g+k/f*e-i%f;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);

	}

}

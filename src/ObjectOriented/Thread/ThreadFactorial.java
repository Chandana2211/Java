/*
 Write a Java Program, where one thread prints a number ( Generate a random number
using Math.random) and another thread prints the factorial of that given number. Both
the outputs should alternate each other.
Eg: Number : 2
 Factorial of 2 : 2
 Number : 5
 Factorial of 5 : 120
The program can quit after executing 5 tim
 */

package ObjectOriented.Thread;
import java.lang.Math;
	
	 class  getNumber extends Thread{
		
		public void run() {
			int mini=0;int maxi = 10;
			for(int i=0;i<5;i++) {
			int random_int=(int) (Math.random()*(maxi-mini+1));
			System.out.println("Random number : "+random_int);
			
			getFactorial myThread1=new getFactorial(random_int);
			myThread1.start();
			while(myThread1.isAlive());
			
			}
			}
	 }
		
	 class  getFactorial extends Thread{
		int ra_int;
		 getFactorial(int r_int){
			 ra_int=r_int;
		 }
		public void run() {
			int fact=1;
			if(ra_int==0)
				System.out.println("Factorial of the given  number : "+ 1+"/n");
			if(ra_int>0) {
				for(int i=ra_int; i>0; i--) {
					fact=fact*i;
				}
				
				System.out.println("Factorial of the given  number : "+ fact);
				System.out.println();
			
		}
			
		}
	 }
		
	 
	 
	 public class ThreadFactorial  {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				getNumber myThread=new getNumber();
				myThread.start();
				

			}
		}
	
		
		
	





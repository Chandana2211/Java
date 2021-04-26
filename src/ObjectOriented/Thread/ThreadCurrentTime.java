
/*
Write a Java Program which will print the current time on the console every 2 seconds.
After doing this activity for 20 seconds the program quits.
 */
package ObjectOriented.Thread;

import java.time.LocalTime;


public class ThreadCurrentTime {
	
	public static void main(String[] args) {
	PrintTime myThread=new PrintTime();
	myThread.start();
	}
	

}


class PrintTime extends Thread{
	static void timePrint() {
		LocalTime myTime=LocalTime.now();
		System.out.println(myTime);
	}
	public void run() {
		
		for(int i=0;i<=10;i++) {
			timePrint();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
}

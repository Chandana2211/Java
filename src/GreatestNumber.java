/*
 Assignment 6:
Write a program to find greatest number in an array

 */
public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,50,20,100,500,30,4800};
		int len=arr.length;
		int maxium=arr[0];
		
		for(int i=1;i<len;i++) {
			if(maxium<arr[i]) {
				maxium=arr[i];
			}
		}
		
		System.out.println("The Greatest Number in array : "+maxium);
		

	}

}

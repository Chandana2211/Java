package Stringss;

public class Palindromee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Malayalam";
		//Convert to lower case
		str=str.toLowerCase();
		System.out.println(str);
		boolean flag=true;
		
		//Compare Character from beginning and End of String
		for(int i=0;i<(str.length()-1)/2;i++) {
			
			if(str.charAt(i)!=str.charAt(str.length()-1-i)){
				flag=false;
				break;
				
			}
		}
		
		if(flag) {
			System.out.println("String is a Palindrome.");
		}
		else
			System.out.println("String is a Not Palindrome.");

	}

}

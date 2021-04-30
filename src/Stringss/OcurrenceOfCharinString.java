package Stringss;

public class OcurrenceOfCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=" Chandana is a very good girl who is studying in abroad";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				count++;
			}
			
		}
		System.out.println("Count of a : "+count);
		
		
		//Without using loop
		String[] str2=str.split("a");
		count=str2.length-1;
		System.out.println("Count of a : "+count);
		
		

	}

}

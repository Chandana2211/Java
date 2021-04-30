package Stringss;

public class PunctuationCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pun=".,'\"?;!;";
		String str="Hello, World!. How are you?";
		int count=0;
		String c="";
		
		for(int i=0;i<str.length();i++) {
			c=Character.toString((str.charAt(i)));
			
			if(pun.contains(c))
				count++;
			
		}
		System.out.println(count);

	}

}

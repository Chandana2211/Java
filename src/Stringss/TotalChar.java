package Stringss;

public class TotalChar {
	static public void main(String args[]) {
		
		String str="Welcome to Planet earth";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				continue;
			}
			
			count++;
		}
		System.out.println(count);
	}

}

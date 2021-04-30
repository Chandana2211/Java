package Stringss;

public class CountVowelConsonants{
	
	public static void main(String args[]) {
		
		String str=" Welcome to VMware ";
		int vowel=0;int consonant=0;
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				vowel++;
			}
			else if(c>='a' && c<='z' || c>='A' && c<='Z' ){
				consonant++;
			}
		}
	   System.out.println("Vowels:"+vowel+"Consonants:" +consonant);
		
	}

}

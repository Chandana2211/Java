package Stringss;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1="Brrag";
		String str2="Graab";
		
		str1 = str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length()) {
			System.out.println("Not an Anagram");
		}
		else {
			char[] chArray1=str1.toCharArray();
			char[] chArray2=str2.toCharArray();
			
			Arrays.sort(chArray1);
			Arrays.sort(chArray2);
			
			
			if(Arrays.equals(chArray1,chArray2)==true) {
				System.out.println("Both  Strings are Anagram");
				
			}
			else {
				System.out.println("Both  Strings are not Anagram");
			}
			
			
			
			
			
			
		}

	}

}

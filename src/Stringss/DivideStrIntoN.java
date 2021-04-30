package Stringss;

public class DivideStrIntoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="aaabbbbbcccc";
	    int len=str.length();
	    int n=3;
	    int temp=0;int chars=len/n;
	    
	    if(len%n!=0) {
	    	System.out.println("String cannot be divided into N eual parts");	    	
	    }
	    else {
	    	String[] parts = new String[n];
	    	
	    	for(int i=0;i<len;i=i+chars) {
	    		parts[temp]=str.substring(i,i+chars);
	    		temp++;
	    		
	    	}
	    	
	    	for(String i:parts) {
	    		System.out.println(i);
	    	}
	    	
	    }
	    
	    
		
		
		

	}

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class InterArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		
		//Adding Integer elements to ArrayList
		numbers.add(22);
		numbers.add(11);
		numbers.add(19);
		numbers.add(96);
		System.out.println("Numbers="+numbers);
		
		
	//Sorting ArrayList	
	   Collections.sort(numbers);
	   
	   
	   //Iterating ArrayList
	   Iterator<Integer> it=numbers.iterator();
	   while(it.hasNext()) {
		   
		   Integer i=it.next();
		   System.out.println(i);
		   if(i<15)
		   {   //Removing elemt from arraylist from iterative method
			   it.remove();
			   System.out.println("\nRemoving Elements less than 15 : "+i);
		   }
	   }
		   
		   System.out.println("\n"+numbers);
	   
		
		

	}

}

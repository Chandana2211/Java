import java.util.HashMap;

public class StrIntHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> people=new HashMap<String,Integer>();
		
		//put items into HashMap
		people.put("John", 23);
		people.put("Mary", 24);
		people.put("Sia", 25);
		people.put("Nia", 26);
		
		//Print Key and Value
		for(String i : people.keySet())
			System.out.println("Name:"+i+"  Age:"+people.get(i));
		
		//Print Keys
		for(String s: people.keySet())
			System.out.println(s);
		//Print values
		for(int i: people.values())
			System.out.println(i);
		
		
		
		
		
		

	}

}

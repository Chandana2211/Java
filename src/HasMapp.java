import java.util.HashMap;
public class HasMapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> capital = new HashMap<String,String>();
		
		//put items into the HashMap
		capital.put("England","London");
		capital.put("Norway", "Oslo");
		capital.put("Germany", "Berlin");
		capital.put("USA", "Washington DC");
		
		System.out.println("Capital Cites of States:\n"+capital);
		System.out.println("Size of Capital Cites\n"+capital.size());
		
		
		//remove England from HashMap
		capital.remove("England");
		System.out.println("\n"+capital);
		
		//Clearing all items in HashMap
		capital.clear();
		System.out.println("\n"+capital);
		
		
	}

}

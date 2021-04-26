import java.util.ArrayList;
import java.util.Collections;//Required to sort ArrayList
import java.util.Iterator;//Required to iterate ArrayList


public class ArrayListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cars=new ArrayList<String>();
		
		//Add items to array List
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println("Cars:\n"+cars);
		System.out.println("\nCar in the first position:" + cars.get(1));
		cars.add("Swift");
		cars.add("Benz");
		cars.add("BMW");
		cars.add("BMW");
		
		//Remove items from the ArrayList
		cars.remove(0);
		System.out.println("\nCars After Removing Volvo="+cars);
		
		//Checks if item exist
		System.out.println("\nDoesn cars contains Benzs?"+cars.contains("Benz"));
		
		cars.set(1, "Opel");
		System.out.println("\nCars After Setting First Position to Opel="+cars);
		
		//Print Array List one by one
		for(String i:cars)
			System.out.println(i);
		
		// Sorting ArrayList
		Collections.sort(cars);
		System.out.println("\nCars After Sorting ArrayList="+cars);
		
		Iterator<String> it=cars.iterator();
		System.out.println("\nIterating First Element of ArrayList:"+it.next());
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		//Clearing all items from the Arraylist
		cars.clear();
		System.out.println("\nCars="+cars);
		
		
		

	}

}


public class LinearSearch {
	
	public static int linearSearch(int key,int array[]) {
		
		for(int i=0;i<array.length;i++) {
			if(array[i]==key)
				return i;
			
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,9,2,8,3,7,4,6,5};
		int key=4;
		
		System.out.println(linearSearch( key,arr));
		
		

	}

}

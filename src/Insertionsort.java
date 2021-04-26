
public class Insertionsort {  
	public static void insertionSort(int array[]) {
		int n=array.length;
		int j,i,key;
		for(j=1;j<n;j++) {
			
			key=array[j];
			i=j-1;
			while(i>-1 && key<array[i]) {
				array[i+1]=array[i];
				i--;
			}
			array[i+1]=key;
			
			
		}
	
}
   
    public static void main(String a[]){    
    
    	int arr[]= {9,14,3,22,6,5,7,1};
    	
    	insertionSort(arr);
    	
    	for(int i:arr) {
    		System.out.println(i);
    	}
    	
  
    }
}
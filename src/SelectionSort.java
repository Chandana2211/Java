
public class SelectionSort {
	
	
	public static void selectionSort(int []array) {
		for(int i=0;i<(array.length);i++) {
			int index=i;
			
			for(int j=i+1;j<array.length;j++) {
				if(array[j]<array[index]) {
					index=j;
				}
				
				int smallestNumber=array[index];
				array[index]=array[i];
				array[i]=smallestNumber;
					
				}
				
			}
			
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,9,2,8,3,7,4,6,5};
		
		selectionSort(arr);
		
		for(int i:arr)
			System.out.println(i);

	}

}

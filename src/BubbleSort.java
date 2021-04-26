
public class BubbleSort {

	public static void bubbleSort(int []array) {
		
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<(array.length)-i;j++) {
				if(array[j-1] >array[j]) {
					int temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
					
				}
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,9,2,8,3,7,4,6,5};
		
		bubbleSort(arr);
		
		for(int i:arr)
			System.out.println(i);
	}

}

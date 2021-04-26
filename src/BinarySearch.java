
public class BinarySearch {
	
	public static void binarySearch(int key, int array[],int first, int last) {
		int mid=(first+last)/2;
		
		while(first<=last) {
			if(array[mid]<key) {
				first=mid+1;
			}
			else if(array[mid]==key) {
				System.out.println("Key found in : "+ mid);
				break;
			}
			else {
				last=mid-1;
			}
		mid=(first+last)/2;
		}
		
		if(first>last) {
			System.out.println("Key not found in the array");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1,9,2,8,3,7,4,6,5};
      int key=4;
      int last=arr.length-1;
      
     binarySearch(key,arr,0,last);
	}

}

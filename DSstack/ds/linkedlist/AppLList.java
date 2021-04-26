package ds.linkedlist;

public class AppLList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList sList=new LinkedList();
		sList.display();
		sList.insert(2);
		sList.insert(3);
		sList.insert(4);
		sList.insert(5);
		sList.insert(6);
		sList.display();
		
		sList.insertFirst(1);
		sList.display();
		
		System.out.println("Number of Nodes="+sList.countNodes());
		
		sList.reverse(sList.head);
		
		

	}

}

package linkedList;

public class App {
	
	public static void main(String[] args) {
		


	SinglyLinkedList sList=new SinglyLinkedList();
	
	sList.insert(30);
	sList.insert(20);
	sList.insert(30);
	sList.insert(10);
	
	sList.display();
	
	
	System.out.println(sList.remove());
	
	sList.display();
	
	sList.insert(100);
	sList.insert(30);
	sList.insert(11);
	sList.insert(22);
	
	sList.display();
	sList.count();
	
	System.out.println(sList.remove(3));
	sList.display();
	sList.count();
	
	System.out.println(sList.midItem());
	
	sList.display();
	SinglyLinkedList reversedList=new SinglyLinkedList();
	reversedList=sList;
	reversedList.reverse();
	reversedList.display();
	reversedList.reverse();
	
    sList.remDuplicate();
	sList.display();
	
	
	
	}
	
}

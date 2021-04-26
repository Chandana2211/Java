
public class SinglyLinkedList {

	
		  static class Node{
		    	int data;
		    	Node next;
		    	
		    	public Node(int data) {
		    		this.data=data;
		    		this.next=null;
		    	}
		    }
		  
		  public Node head=null;
		  
		  public void display() {
			  System.out.println("Nodes in the Singly Linked List");
			  Node current=head;
			  if(head==null) {
				  System.out.println("Empty Linked List");
			  }
			  else {
				  while(current!=null) {
					  System.out.println(current.data+" ");
					  current=current.next;
				  }
				  System.out.println();
			  }
		  }
		  
		  public static void main(String[] args) {
				// TODO Auto-generated method stub
			  SinglyLinkedList list=new SinglyLinkedList();
			  list.head= new Node(100);
			  Node second= new Node(200);
			  Node third=new Node(300);
			  
			  list.head.next= second;
			  second.next=third;
			  list.display();
			  
			  
		  

	}

}

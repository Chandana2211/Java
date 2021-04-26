package ds.linkedlist;

public class LinkedList {

	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
		
		
		public Node head=null;
		public Node tail=null;
		
		//Inserting new node to the list
		public void insert(int data) {
			
			Node newNode= new Node(data);
			
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				tail.next=newNode;
				tail=newNode;
			}
		}
		
		
		//
		public int countNodes() {
			int count=0;
			Node current=head;
			while(current!=null) {
				count++;
				current=current.next;
			}
			
			return count;
		}
		
		
		//display all the nodes present in the list
		public void display() {
			
			Node current=head;
			
			if(head==null) {
				System.out.println("List is Empty");
			}
			else {
				System.out.println("Nodes of LinkedList:");
				while(current!=null) {
					System.out.print(current.data+"  ");
					current=current.next;
				}
			}
			
			System.out.println();
		}
		
		//Inserting element at head
		public void insertFirst(int data) {
			Node newNode= new Node(data);
			newNode.data=data;
			newNode.next=head;
			head=newNode;
		}

		public void reverse(Node current) {
			if(head==null)
				System.out.println("Linked List id Empty");
			else {
				while(current.next==null) {
					System.out.println(current.data+" ");
					return;
				}
				
				reverse(current.next);
				System.out.println(current.data+" ");
			}
			
			
		}
		public void delete()	{}
		
	
}

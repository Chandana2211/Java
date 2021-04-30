package linkedList;

public class SinglyLinkedList {
	class Node{
		int data;
		Node next;
        
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public Node head=null;
	public Node tail=null;
	
	
	public void insert(int data) {
		
		Node newNode = new Node(data);
		
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}
	
	public void display() {
		Node current =head;
		
		if(head==null){
		   System.out.println("LinkedListed is empty");
		   return;
		}
		
		while(current!=null) {
			
			System.out.print(current.data+"  ");
			if(current.next==null)
				tail=current;
			current=current.next;
			
		}
		System.out.println();
		
	}
	
	
	public int remove() {
		Node current = head;
		if(head==tail)
			return -1;
	 while(current.next!=tail) {
		 current=current.next;
		 Node temp=current.next;
		 if(current.next==tail) {
			 tail=current;
			 current.next=null;
			 return temp.data;
		 }
		}
	 return 0;
	}

	public int remove(int pos){
	
		Node current=head;
		int rem=pos-2;
		int count=0;
		
		while(current.next!=null)
		{
			if(count>rem) {
				System.out.println("Mentioned position is not there");
				return-1;
			}	
			
			if(count==rem) {
				Node temp=current.next;
				current.next=temp.next;
				return temp.data;
			}
			
			current=current.next;
			count++;
		}		
		return 0;
    }
	
	
	
	public int count() {
		Node current=head;
		int count=0;
		while(current!=null) {
			count++;
			current=current.next;
			
		}
		
		System.out.println("Count="+count);
		return count;
	}
	
	
	
	public int midItem() {
		
		int total=count();
		
		if(head==tail)
			return displayPos(0);
	   if(total%2==0)
		   return displayPos(total/2+1);
	   else
		   return displayPos(total/2);		
	}
	
	public int displayPos(int pos) {
		Node current=head;
		int count=0;Node temp=null;
		
		if(head==tail)
			return head.data;
		else {
			while(count<pos) {
				temp=current;
				current=current.next;
				count++;
			}
			
		}
		
		return temp.data;
		
	}
	
	public void reverse(){
		Node current=head;
		Node prev=null;
		Node nextt=null;
		while(current!=null) {
			nextt=current.next;
            current.next=prev;
			prev=current;
			current=nextt;
			
		}
		
		head=prev;
		
		
	}
	
	
	public void remDuplicate() {
		Node current=head,index=null,temp=null;
		if(head==null) {
			System.out.println("LinkedList is Empty");
		}
		else {

		
		while(current!=null) {
		temp=current;
		index=current.next;
		
		
		while(index!=null) {
			if(index.data==temp.data) {
				temp.next=index.next;
			}
			else {
				temp=index;
			}
			index=index.next;
			}
		
		current=current.next;
		
		
	}
	
	
	}
	}
	
	

}

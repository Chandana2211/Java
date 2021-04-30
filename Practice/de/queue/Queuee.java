package de.queue;

public class Queuee {
     
		int maxsize;
		int count;
		long[] queueArray;
		int front;
		int rear;
		
		Queuee(int maxsize){
			this.maxsize=maxsize;
			queueArray=new long[maxsize];
			front=0;
			rear=-1;
		}
		
		void insert(long i) {
		  if(isFull()) {
			  System.out.println("Queue is Full");
		  }
		  else {
			  rear++;
			  queueArray[rear]=i;
			  
			  count++;
		  }
		}
		
		long remove() {
			if(isEmpty()) {
				 System.out.println("Queue is Empty");
				 return -1;
			}
			
			else {
				int temp=front;
				front++;
				count--;
				return queueArray[temp];
				
				
			}
		}
		
		long peekFront() {
			return queueArray[front];
		}
		
		  void view(){
			  System.out.println("[");
			  for(int i=0;i<rear;i++) {
				  System.out.println(queueArray[rear]+" ");
				   }
			  System.out.println("]");
		  }
			
			boolean isFull(){
				return count==maxsize;
			}
			
			boolean isEmpty() {
				return count==0;
		}

}

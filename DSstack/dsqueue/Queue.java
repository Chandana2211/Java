package dsqueue;

public class Queue {
	
	private int maxsize;
	private long[] queArray;
	private int front;
	private int rear;
	private int count;
	
	public Queue(int size){
		this.maxsize=size;
		this.queArray = new long[size];
		front=0;
		rear=-1;
	}
	
	public void insert(long i ) {
		rear++;
		queArray[rear]=i;
		count++;
		
	}
	
	public void view() {
		System.out.print("[");
		for(int i=front;i<rear;i++) {
			System.out.print(queArray[i]+" ");
		}
		System.out.println("]");
	}
	
	public long remove() {
		long temp=queArray[front];
		front++;
		count--;
		return temp;
		
	}
	
	public boolean isEmpty() {
		return (count==0);
	}
	
	public boolean isFull(){
		return (count==maxsize);
	}

	public long peekFront() {
		return queArray[front];
	}
}

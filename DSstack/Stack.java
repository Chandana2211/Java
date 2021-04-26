
public class Stack {
	
	private int maxsize;
	private long[] stackArray;
	private int top;
	
	public Stack(int size) {
		this.maxsize=size;
		this.stackArray = new long[maxsize];
		this.top=-1;
	}

	public void push(long i) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}
		else {
		top++;
		stackArray[top]=i;
		}
	}
	
	public long pop() {
		if(isEmpty()) {
			return -1;
		}
		else {
		int old_top=top;
		top--;
		return stackArray[old_top];
		}
	}
	
	public long peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public boolean isFull() {
		return (top==maxsize-1);
	}
}

package ds.stack;

public class Stackk {

	int maxsize;
    long[] stackArray;
    int top;
    
    Stackk(int maxsize){
    	this.maxsize=maxsize;
    	this.stackArray=new long[maxsize];
    	top=-1;
    	
    }
	
    
    
    
    public void push(long i) {
    	if(isFull()) {
    		System.out.println("stack is Full");
    	}
    	else {
    		top++;
    		stackArray[top]=i;
    	}
    	
    }
    
    
    public long pop() {
    	int old_top=0;
    	if(isEmpty()) {
    		System.out.println("stack is Empty");
    	}
    	else {
    	     old_top=top;
    		top--;
    	}
    	
    	return stackArray[old_top];
    }
    
    public long peek() {
    	return stackArray[top];
    }
    
    
     boolean isFull() {
    	return top==maxsize-1;
    	}
    boolean isEmpty() {
    	return top==-1;
    }
    
    
    }
	


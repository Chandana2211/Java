package ds.stack;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stackk stack=new Stackk(6);
		System.out.println(stack.isFull());
		System.out.println(stack.isEmpty());
		stack.push(10);
		stack.push(30);
		stack.push(20);
		System.out.println(stack.peek());
		stack.push(50);
		stack.push(10);
		stack.push(100);
		System.out.println(stack.isFull());
		System.out.println(stack.isEmpty());
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		
		

	}

}

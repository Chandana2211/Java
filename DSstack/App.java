
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack stack=new Stack(6);
		
		stack.push(22);
		stack.push(11);
		stack.push(12);
		stack.push(222);
		stack.push(212);
		stack.push(2);
		stack.push(222);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		stack.push(12);
		stack.push(222);
		stack.push(222);
		System.out.println(stack.isFull());
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
		
	}

}

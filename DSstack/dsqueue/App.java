package dsqueue;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Queue queue=new Queue(5);
		
		queue.insert(6);
		queue.insert(7);
        queue.insert(8);
        queue.insert(9);
        queue.insert(10);
        System.out.println(queue.isFull());
        queue.view();
        
        System.out.println(queue.remove());
        
        queue.view();
	}

}

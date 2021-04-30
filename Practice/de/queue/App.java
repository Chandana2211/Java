package de.queue;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queuee que = new Queuee(6);
		System.out.println(que.isEmpty());
		que.insert(10);
		que.insert(20);
		que.insert(40);
		System.out.println(que.peekFront());
		que.insert(50);
		que.insert(20);
		que.insert(40);
		System.out.println(que.isFull());
		System.out.println(que.peekFront());
		System.out.println(que.remove());
		System.out.println(que.peekFront());
		
		
		

	}

}

public class MyQueue {
	Node head;
	
	MyQueue(){
		head = null;
	}
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	
}

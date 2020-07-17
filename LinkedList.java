
public class LinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	public void insert(int data) {
		Node temp;
		if(head == null) {
			head = new Node(data);
			return;
		}
		else {
			temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(data);
		}
	}
	public void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.println("The data in the list is " + temp.data);
			temp = temp.next;
		}
	}
	public void removeFirstElement() {
		if(head == null) {
			System.out.println("There is no head for this list, this list belongs to Gayathri Muahahaahhahahaha");
			return;
		}
		head = head.next;
		System.out.println("The head of the Linked list is removed");
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(4);
		list.insert(5);
		list.printList();
		list.removeFirstElement();
		list.removeFirstElement();
		list.removeFirstElement();
	}

}

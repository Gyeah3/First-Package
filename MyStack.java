import static org.junit.Assert.assertEquals;

public class MyStack {
	Node top;

	MyStack() {
		top = null;
	}

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public int peek() {
		return top.data;
	}

	public void push(int data) {
		if (top == null) {
			top = new Node(data);
		} else {
			Node temp = new Node(data);
			temp.next = top;
			top = temp;
		}
	}

	public Node pop() {
		if (top != null) {
			System.out.println("The element removed is :" + top.data);
			Node temp = top;
			top = top.next;
			return temp;
		}
		System.out.println("This stack is empty, cannot remove any elements");
		return null;
	}

	public static void main(String[] args) {
		MyStack s = new MyStack();
		s.push(1);
		s.push(2);
		s.push(10);
		s.push(15);
		s.push(35);
		System.out.println("The top of the stack is: " + s.peek());
		assertEquals(35, s.peek());
		assertEquals(35, s.pop().data);
		assertEquals(15, s.pop().data);
	}

}

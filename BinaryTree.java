
class Node 
{ 
    int key; 
    Node left, right; 
  
    public Node(int item) 
    { 
        this.key = item; 
        left = right = null; 
    } 
} 
public class BinaryTree {
	Node root; 
    BinaryTree(int key) 
    { 
        root = new Node(key); 
    } 
  
    BinaryTree() 
    { 
        root = null; 
    }
    private Node insert(Node node, int key) {
    	if(node == null) {
    		node = new Node(key);
    		return node;
    	}
    	if(key <= node.key) {
    		node.left = insert(node.left, key);
    	}
    	if(key >= node.key) {
    		node.right = insert(node.right, key);
    	}
    	return node;
    }
    public void insert(int key) {
    	root = insert(root, key);
    }
    private Node search(Node node, int key) {
    	if(node == null || node.key == key)
    		return node;
    	if(key < node.key)
    		return search(node.left, key);
    	if(key > node.key)
    		return search(node.right, key);
    	return node;
    }
    public Node search(int key) {
    	return search(root, key);
    }
    private int getHeight(Node node) {
    	if(node == null)
    		return 0;
    		int left = getHeight(node.left);
    		int right = getHeight(node.right);
    	return Math.max(left, right) + 1;
    }
    public int getHeight() {
    	return getHeight(root);
    }
    public static void main(String[] args) {
    	BinaryTree B = new BinaryTree();
    	B.insert(3);
    	B.insert(4);
    	B.insert(100);
    	B.insert(50);
    	B.insert(75);
    	B.insert(6);
    	
    	B.search(100);
    	if(B.search(100) != null)
    		System.out.println("The node for the value of 100 is found");
    	System.out.println("The height of the tree is " + B.getHeight());
    }
    	
    }
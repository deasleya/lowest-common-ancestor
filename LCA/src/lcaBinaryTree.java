class Node {
	int value;
	Node left;
	Node right;
	
	Node(int value){
		this.value = value;
		right = null;
		left = null;
	}
}

public class lcaBinaryTree {
	
	static Node createBinaryTree(){
		Node root = new Node(1);
		return root;
	}

}

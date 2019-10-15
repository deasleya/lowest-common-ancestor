// TODO: IMPLEMENT LCA ON DIRECTED ACYCLIC GRAPH
import java.util.ArrayList; 
import java.util.List; 
  

class Node
{
	int nodeNumber;
	Node left;
	Node right;
	ArrayList<Node> ancestors;
	Node(int value)
	{
		nodeNumber=value;
		left=right;
		left = null;
		right = null;
		ancestors=null;
	}
}

public class LCA 
{
	Node root; //initialises root
	List<Integer> n1Path = new ArrayList<>(); //creates list for node 1's path
	List<Integer> n2Path = new ArrayList<>(); // creates list for node 2's path
	
	public int LowestCommonAncestorDAG (Node n1, Node n2) //function for lowest common ancestor in DAG
	{
		return findLowestCommonAncestorDAG(root, n1, n2);
	}
	
	public int findLowestCommonAncestorDAG(Node root, Node n1, Node n2)  //function to find lowest common ancestor 
	{
		if(n1!=null && n2!=null) //returns 0 if n1 or n2 are null
		{
			if(n1.ancestors!=null && n2.ancestors!=null) // returns root if n1 or n2's ancestors are null
			{
				for(int i=0; i<n2.ancestors.size(); i++) //loops through number of ancestors of n2
				{
					for(int j=0; j<n1.ancestors.size(); j++) //loops through selected nodes ancestors
					{
						if(n2.ancestors.get(i)==n1.ancestors.get(j)) //checks if n1 or n2 share ancestors
						{
							return n2.ancestors.get(i).nodeNumber; //if so returns lowest one
						}
					}
				}
			}
//			else return root.nodeNumber; 
		}
		return 0;
	}
	
	public boolean nodesPresent (Node root, int num, List<Integer> path) //check to see if a node is present in the tree.
	{ 
		if (root == null) return false; //checks if desired node is null
		path.add(root.nodeNumber); //adds node
		if (root.nodeNumber == num) return true; //checks if desired node is the current node 
		if (root.left!=null && nodesPresent(root.left, num, path)) return true; //checks left subtree
		if (root.right!=null && nodesPresent(root.right, num, path)) return true; //checks right subtree
		path.remove(path.size()-1); //removes last node
		return false; //default return is false
	}
	
	public void addToGraph(Node n1) //function to add node to DAG
	{
		n1.ancestors = new ArrayList <Node> (); //creates an array list to stores ancestors for node 1
		n1.ancestors.add(n1); //adds node 1 to the list of ancestors for itself
	}
	
	public void addAncestorsToNode(Node n1, Node n2) 
	{
		for (int i=0; i < n1.ancestors.size(); i++) //loops through ancestors of node 1
		{
			if(!n2.ancestors.contains(n1.ancestors.get(i))) //if node 2's ancestors aren't the same as node 1 at particular index
			{
				n2.ancestors.add(n1.ancestors.get(i)); //add it
			}
		}
	}
	public void addAncestorsToNodeAtPosition(int pos, Node n1, Node n2) //function to add nodes at particular position in list
	{
		for (int i=0; i < n1.ancestors.size(); i++) //loops through ancestors of node 1 
		{
			if(!n2.ancestors.contains(n1.ancestors.get(i))) //if node 2's ancestors aren't the same as node 1 at particular index
			{
				n2.ancestors.add(pos, n1.ancestors.get(i)); //add it in correct position
			}
		}
	}
	public int LowestCommonAncestorBST (int n1, int n2)
	{
		n1Path.clear(); //clears path of ancestors for node 1
		n2Path.clear(); //clears path of ancestors for node 2
		return findLowestCommonAncestorBST(root, n1, n2); //calls on function to find LCA for two desired nodes
	}

	public int findLowestCommonAncestorBST(Node root, int n1, int n2)
	{
		if (!nodesPresent(root, n1, n1Path) || !nodesPresent(root, n2, n2Path))  //checks if nodes aren't in paths
		{
			if(n1Path.size() == 0 && n2Path.size() == 0) //if neither nodes are in the tree
			{
				if(!n1Path.contains(n1) && !n2Path.contains(n2)) //checks if the tree is empty
				{
					System.out.println("Node 1 is not in the binary tree"); 
				}
//				else	 System.out.println("The tree is empty"); //the specified nodes are not in the binary tree as their paths don't exist
			}
			if (n1Path.size() > 0 && n2Path.size() == 0) //checks if node 2 is not in binary tree
			{
				System.out.println("Node 2 is not in the binary tree");
			}
			return -1; //if so returns -1
		}
		
		int i;
		for (i = 0; i < n1Path.size() && i < n2Path.size(); i++) //for loop that loops through n1's and n2's path of ancestors
		{
			if (!n1Path.get(i).equals(n2Path.get(i))) //if ancestors don't match
			{
				break;
			}
		}
		return n1Path.get(i - 1); //returns previous ancestor
	}
}





// LCA1 DEVELOPMENT TASK - BINARY TREE IMPLEMENTATION 

  
////A Binary Tree node 
//class Node { 
// int data; 
// Node left, right; 
//
// Node(int value) { 
//     data = value; 
//     left = right = null; 
// } 
//} 


//public class LCA  
//{ 
//  
//    Node root; 
//    private List<Integer> path1 = new ArrayList<>(); 
//    private List<Integer> path2 = new ArrayList<>(); 
//    
//    private Node addRecursive(Node current, int value) {
//    	if (current == null) {
//    		return new Node(value);
//    	}
//
//    	if (value < current.data) {
//    		current.left = addRecursive(current.left, value);
//    	} else if (value > current.data) {
//    		current.right = addRecursive(current.right, value);
//    	} else {
//    		// value already exists
//    		return current;
//    	}
//
//    	return current;
//    }
//
//    public void add(int value) {
//    	root = addRecursive(root, value);
//    }
//  
//    private Node deleteRecursive(Node current, int value) {
//    	if (current == null) {
//    		return current;
//    	}
//
//    	if (value < current.data) {
//    		current.left = deleteRecursive(current.left, value);
//    	}
//    	else if (value > current.data) {
//    		current.right = deleteRecursive(current.right, value);
//    	}
//    	else {
//    		if(current.left == null)
//    			return current.right;
//    		else if (current.right == null) 
//    			return current.left;
//    		current.data = findSmallestValue(root.right);
//    		current.right = deleteRecursive(root.right, root.data); 
//    	}
//    	return current;
//    }
//
//    private int findSmallestValue(Node root) {
//    	return root.left == null ? root.data : findSmallestValue(root.left);
//    }
//
//    public void delete(int value) {
//    	root = deleteRecursive(root, value);
//    	System.out.println("Node with value " + value + " has been deleted");
//    }
//    
//    
//    
// // Finds the path from root node to given root of the tree. 
//    int findLCA(int n1, int n2) { 
//        path1.clear(); 
//        path2.clear(); 
//        return findLCAInternal(root, n1, n2); 
//    } 
//    	
//    private int findLCAInternal(Node root, int n1, int n2) { 
//  
//        if (!findPath(root, n1, path1) || !findPath(root, n2, path2)) { 
//            System.out.println((path1.size() > 0) ? "n1 is present" : "n1 is missing"); 
//            System.out.println((path2.size() > 0) ? "n2 is present" : "n2 is missing"); 
//            return -1; 
//        } 
//  
//        int i; 
//        for (i = 0; i < path1.size() && i < path2.size(); i++) { 
//              
//        // System.out.println(path1.get(i) + " " + path2.get(i)); 
//            if (!path1.get(i).equals(path2.get(i))) 
//                break; 
//        } 
//  
//        return path1.get(i-1); 
//    } 
//      
//    // Finds the path from root node to given root of the tree, Stores the 
//    // path in a vector path[], returns true if path exists otherwise false 
//    private boolean findPath(Node root, int n, List<Integer> path) 
//    { 
//        // base case 
//        if (root == null) { 
//            return false; 
//        } 
//          
//        // Store this node . The node will be removed if 
//        // not in path from root to n. 
//        path.add(root.data); 
//  
//        if (root.data == n) { 
//            return true; 
//        } 
//  
//        if (root.left != null && findPath(root.left, n, path)) { 
//            return true; 
//        } 
//  
//        if (root.right != null && findPath(root.right, n, path)) { 
//            return true; 
//        } 
//  
//        // If not present in subtree rooted with root, remove root from 
//        // path[] and return false 
//        path.remove(path.size()-1); 
//  
//        return false; 
//    } 
//}
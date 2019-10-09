//import java.util.ArrayList;
//import java.util.List;
//
//class Node {
//	int value;
//	Node left, right;
//	
//	Node(int value){
//		this.value = value;
//		right = null;
//		left = null;
//	}
//}
//
//public class lcaBinaryTree 
//{
// 
//    Node root;
//    private List<Integer> path1 = new ArrayList<>();
//    private List<Integer> path2 = new ArrayList<>();
// 
//    int findLCA(int n1, int n2) {
//        path1.clear();
//        path2.clear();
//        return findLCAInternal(root, n1, n2);
//    }
// 
//    private int findLCAInternal(Node root, int n1, int n2) {
// 
//        if (!findPath(root, n1, path1) || !findPath(root, n2, path2)) {
//            return -1;
//        }
// 
//        int i;
//        for (i = 0; i < path1.size() && i < path2.size(); i++) {
//            if (!path1.get(i).equals(path2.get(i)))
//                break;
//        }
// 
//        return path1.get(i-1);
//    }
// 
//    private boolean findPath(Node root, int n, List<Integer> path)
//    {
//        if (root == null) {
//            return false;
//        }
// 
//        path.add(root.value);
// 
//        if (root.value == n) {
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
//        path.remove(path.size()-1);
// 
//        return false;
//    }
// 
//
//}




//class Node {
//    int value;
//    Node left;
//    Node right;
// 
//    Node(int value) {
//        this.value = value;
//        right = null;
//        left = null;
//    }
//}
//
//public class lcaBinaryTree {
//	 
//    Node root;
// 
//    private Node addRecursive(Node current, int value) {
//        if (current == null) {
//            return new Node(value);
//        }
//     
//        if (value < current.value) {
//            current.left = addRecursive(current.left, value);
//        } else if (value > current.value) {
//            current.right = addRecursive(current.right, value);
//        } else {
//            // value already exists
//            return current;
//        }
//     
//        return current;
//    }
//    
//    public void add(int value) {
//        root = addRecursive(root, value);
//    }
//    
//    private boolean containsNodeRecursive(Node current, int value) {
//        if (current == null) {
//            return false;
//        } 
//        if (value == current.value) {
//            return true;
//        } 
//        return value < current.value
//          ? containsNodeRecursive(current.left, value)
//          : containsNodeRecursive(current.right, value);
//    }
//    
//    public boolean containsNode(int value) {
//        return containsNodeRecursive(root, value);
//    }
//    
//    private Node deleteRecursive(Node current, int value) {
//        if (current == null) {
//            return null;
//        }
//     
//        if (value == current.value) {
//        	if (current.left == null && current.right == null) {
//        	    return null;
//        	}
//        	if (current.right == null) {
//        	    return current.left;
//        	}
//        	 
//        	if (current.left == null) {
//        	    return current.right;
//        	}
//        } 
//        if (value < current.value) {
//            current.left = deleteRecursive(current.left, value);
//            return current;
//        }
//        int smallestValue = findSmallestValue(current.right);
//        current.value = smallestValue;
//        current.right = deleteRecursive(current.right, smallestValue);
//        return current;
//    }
//    
//    private int findSmallestValue(Node root) {
//        return root.left == null ? root.value : findSmallestValue(root.left);
//    }
//    
//    public void delete(int value) {
//        root = deleteRecursive(root, value);
//    }
//}





// Java Program for Lowest Common Ancestor in a Binary Tree 
// A O(n) solution to find LCA of two given values n1 and n2 
import java.util.ArrayList; 
import java.util.List; 
  
// A Binary Tree node 
class Node { 
    int data; 
    Node left, right; 
  
    Node(int value) { 
        data = value; 
        left = right = null; 
    } 
} 
  
public class lcaBinaryTree  
{ 
  
    Node root; 
    private List<Integer> path1 = new ArrayList<>(); 
    private List<Integer> path2 = new ArrayList<>(); 
    
    private Node addRecursive(Node current, int value) {
    	if (current == null) {
    		return new Node(value);
    	}

    	if (value < current.data) {
    		current.left = addRecursive(current.left, value);
    	} else if (value > current.data) {
    		current.right = addRecursive(current.right, value);
    	} else {
    		// value already exists
    		return current;
    	}

    	return current;
    }

    public void add(int value) {
    	root = addRecursive(root, value);
    }
  
    // Finds the path from root node to given root of the tree. 
    int findLCA(int n1, int n2) { 
        path1.clear(); 
        path2.clear(); 
        return findLCAInternal(root, n1, n2); 
    } 
  
    private int findLCAInternal(Node root, int n1, int n2) { 
  
        if (!findPath(root, n1, path1) || !findPath(root, n2, path2)) { 
            System.out.println((path1.size() > 0) ? "n1 is present" : "n1 is missing"); 
            System.out.println((path2.size() > 0) ? "n2 is present" : "n2 is missing"); 
            return -1; 
        } 
  
        int i; 
        for (i = 0; i < path1.size() && i < path2.size(); i++) { 
              
        // System.out.println(path1.get(i) + " " + path2.get(i)); 
            if (!path1.get(i).equals(path2.get(i))) 
                break; 
        } 
  
        return path1.get(i-1); 
    } 
      
    // Finds the path from root node to given root of the tree, Stores the 
    // path in a vector path[], returns true if path exists otherwise false 
    private boolean findPath(Node root, int n, List<Integer> path) 
    { 
        // base case 
        if (root == null) { 
            return false; 
        } 
          
        // Store this node . The node will be removed if 
        // not in path from root to n. 
        path.add(root.data); 
  
        if (root.data == n) { 
            return true; 
        } 
  
        if (root.left != null && findPath(root.left, n, path)) { 
            return true; 
        } 
  
        if (root.right != null && findPath(root.right, n, path)) { 
            return true; 
        } 
  
        // If not present in subtree rooted with root, remove root from 
        // path[] and return false 
        path.remove(path.size()-1); 
  
        return false; 
    } 
}
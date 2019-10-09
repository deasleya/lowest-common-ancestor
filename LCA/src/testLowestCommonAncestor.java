import static org.junit.Assert.*;
//import static org.junit.Assert.assertThat;

import org.junit.Test;

public class testLowestCommonAncestor {
	
	// test constructor
	@Test
    public void testConstructor()
    {
      new Node(0);
    }

	// test creation of binary tree
	@Test
	public void testEmptyTree() {
		
		// create empty binary tree, expect return of -1 when checking for LCA of 2 values as neither are in binary tree
		lcaBinaryTree emptyTree = new lcaBinaryTree();
		assertEquals("The binary tree is empty", -1, emptyTree.findLCA(1, 2));
		
		// add a node to the binary tree for comparison, still expect -1 to be returned as there is only one value
		emptyTree.add(2);
		assertEquals("The binary tree is empty", -1, emptyTree.findLCA(1, 2));
		
		// add a second node and look up LCA of two values both now contained in binary tree, expect root value to be returned (2)
		emptyTree.add(1);
		assertEquals("The binary tree is empty", 2, emptyTree.findLCA(1, 2));
		
	}
	
	@Test
	public void testContains() {
		// test contains method checking if binary tree contains given value to ensure only valid parameters are accepted when searching for a lca
	}
	
	@Test
	public void testAdd() {
		
	}
	
	@Test
	public void testDelete() {
		// test delete method checking if node has been correctly deleted from binary tree
	}

	
}

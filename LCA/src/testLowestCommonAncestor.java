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
		lcaBinaryTree emptyTree = new lcaBinaryTree();
		assertEquals("The binary tree is empty", -1, emptyTree.findLCA(1, 2));
	}
	
	@Test
	public void testContains() {
		// test contains method checking if binary tree contains given value to ensure only valid parameters are accepted when searching for a lca
	}
	
	@Test
	public void testAdd() {
		// test add method checking if node has been correctly added to binary tree
	}
	
	@Test
	public void testDelete() {
		// test delete method checking if node has been correctly deleted from binary tree
	}

	
}

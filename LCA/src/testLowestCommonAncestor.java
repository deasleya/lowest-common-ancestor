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
	
//	@Test
//	public void testInvalidSearchParameter() {
//		lowestCommonAncestor(root, c, d);
//		Node root = createBinaryTree();
//		assertNotNull("The binary tree is empty", root);
//		//fail("Not yet implemented");
//	}

}

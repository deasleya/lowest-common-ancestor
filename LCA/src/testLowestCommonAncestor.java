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
		Node root = lcaBinaryTree.createBinaryTree();
		assertNotNull("The binary tree is empty", root);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testInvalidSearchParameter() {
		lowestCommonAncestor(root, c, d);
		Node root = createBinaryTree();
		assertNotNull("The binary tree is empty", root);
		//fail("Not yet implemented");
	}

}

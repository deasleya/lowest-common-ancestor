import static org.junit.Assert.*;
//import static org.junit.Assert.assertThat;

import org.junit.Test;

public class testLowestCommonAncestor {

	@Test
	public void testEmptyTree() {
		Node root = createBinaryTree();
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

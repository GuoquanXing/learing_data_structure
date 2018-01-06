package binarytree;

public class MyBinaryTreeTest {
	
	public static void main(String[] args) {

		MyBinaryTreeOperation treeOperation = new MyBinaryTreeOperation();

		System.out.println("Tree in SB:" + treeOperation.traverseTreeAndAddToStringBuffer(treeOperation.root));
		
		System.out.println();
		System.out.println("The tree contains " + treeOperation.nodes + " nodes");

		System.out.println();
		System.out.println("After converse:");

//		tree = treeOperation.converseTree(tree);
//		treeOperation.traverseTree(tree);

	}

}

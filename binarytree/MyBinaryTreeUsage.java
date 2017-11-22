package binarytree;

public class MyBinaryTreeUsage {
	
	MyBinaryTree root;
	
	
public static void main(String[] args){
		
		MyBinaryTreeUsage treeUsage = new MyBinaryTreeUsage();
		MyBinaryTree tree = treeUsage.buildBinaryTree();
		
		System.out.println("Before converse:");
		treeUsage.traverseTree(tree);
		
		System.out.println();
		System.out.println("After converse:");
		
		tree = treeUsage.converseTree(tree);
		treeUsage.traverseTree(tree);
		
		
	}
	
	void traverseTree(MyBinaryTree tree){
		
		if (tree == null){
			return;
		}
		//the location of this statement determines the time when to access the node content
		System.out.print(tree.value); 
		System.out.print(' '); 
		if (tree.leftChild != null){
			MyBinaryTree tmp = tree.leftChild;
			traverseTree(tmp);
		}
		if (tree.rightChild != null){
			MyBinaryTree tmp = tree.rightChild;
			traverseTree(tmp);
		}
   
	}
	
	MyBinaryTree converseTree(MyBinaryTree tree){
		
		MyBinaryTree tmp = tree.leftChild;
		tree.leftChild = tree.rightChild;
		tree.rightChild = tmp;
		
		if (tree.leftChild != null){
			MyBinaryTree tmp1 = tree.leftChild;
			converseTree(tmp1);
		}
		if (tree.rightChild != null){
			MyBinaryTree tmp2 = tree.rightChild;
			converseTree(tmp2);
		}
		
		return tree;
		
		
	}
	
	MyBinaryTree buildBinaryTree() {
		
		MyBinaryTree root, node10, node2, node3,node4,node5,node6,node7,node8,node9;

		/**
		 * Nodes without child
		 */
		node5 = new MyBinaryTree();
		node5.leftChild = null;
		node5.rightChild = null;
		node5.value = 5;
		
		node3 = new MyBinaryTree();
		node3.leftChild = null;
		node3.rightChild = null;
		node3.value = 3;
		
		node6 = new MyBinaryTree();
		node6.leftChild = null;
		node6.rightChild = null;
		node6.value = 6;
		
		node7 = new MyBinaryTree();
		node7.leftChild = null;
		node7.rightChild = null;
		node7.value = 7;
		
		node10 = new MyBinaryTree();
		node10.leftChild = null;
		node10.rightChild = null;
		node10.value = 10;
		
		/**
		 * Nodes with one child
		 */
		node8 = new MyBinaryTree();
		node8.leftChild = node10;
		node8.rightChild = null;
		node8.value = 8;
		
		/**
		 * Nodes with two children
		 */
		node4 = new MyBinaryTree();
		node4.leftChild = node5;
		node4.rightChild = node6;
		node4.value = 4;
		
		node2 = new MyBinaryTree();
		node2.leftChild = node3;
		node2.rightChild = node4;
		node2.value = 2;
		
		node9 = new MyBinaryTree();
		node9.leftChild = node7;
		node9.rightChild = node8;
		node9.value = 9;
		
		/**
		 * Node root
		 */
		root = new MyBinaryTree();
		root.leftChild = node2;
		root.rightChild = node9;
		root.value = 1;
	
		return root;
	}

}

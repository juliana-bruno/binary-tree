/*
 * Name: Juliana Bruno
 * Lab: 8
 * Title: TestProgram.java
 * Description: creates a binary tree and uses methods to print out different structures
 * Date: 11/24/25
 */

public class TestProgram {

	public static void main(String[] args) {
		
		BinaryTree<Character> treex = new BinaryTree<Character>('X',null,null);
		BinaryTree<Character> treey = new BinaryTree<Character>('Y',null,null);
		BinaryTree<Character> op1 = new BinaryTree<Character>('+',treex,treey);
		
		BinaryTree<Character> treea = new BinaryTree<Character>('a',null,null);
		BinaryTree<Character> treeb = new BinaryTree<Character>('b',null,null);
		BinaryTree<Character> op2 = new BinaryTree<Character>('+',treea,treeb);
		BinaryTree<Character> treec = new BinaryTree<Character>('c',null,null);
		BinaryTree<Character> op3 = new BinaryTree<Character>('/',op2,treec);
		BinaryTree<Character> root = new BinaryTree<Character>('*',op1,op3);
		
		System.out.println("Preorder traversal: ");
		root.preOrder();
		System.out.println();
		
		System.out.println("Inorder traversal: ");
		root.inOrder();
		System.out.println();

		System.out.println("Postorder traversal: ");
		root.postOrder();	
		System.out.println();

		System.out.println("Breadth first traversal: ");
		root.breadthFirstTraversal();
		
	}

}

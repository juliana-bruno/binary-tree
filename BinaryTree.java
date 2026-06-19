/*
 * Name: Juliana Bruno
 * Lab: 8
 * Title: BinaryTree.java
 * Description: methods for printing out a binary tree in different structures
 * Date: 11/24/25
 */

import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree<E> {
	
		private class Node<E>{
			private E data;
			private Node<E> left;
			private Node<E> right;
			
			public Node(E value) {
				data = value;
				left = null;
				right = null;
			}
			
			public Node(E value, Node<E> leftRef, Node<E> rightRef) {
				data = value;
				left = leftRef;
				right = rightRef;
			}
		}

		private Node<E> root;
		
		public BinaryTree() {
			root = null;
		}
		
		public BinaryTree(Node<E> rootRef) {
			root = rootRef;
		}
		
		public BinaryTree(E value, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
			root = new Node<E>(value);
			if(leftTree != null) {
				root.left = leftTree.root;
			} else {
				root.left = null;
			}
			if(rightTree != null) {
				root.right = rightTree.root;
			} else {
				root.right = null;
			}
		}
		
		public BinaryTree<E> getLeftSubtree(){
			if (root != null && root.left != null) {
				return new BinaryTree<E>(root.left);
			} else {
				return new BinaryTree<E>(null);
			}
		}
		
		public BinaryTree<E> getRightSubtree(){
			if (root != null && root.right != null) {
				return new BinaryTree<E>(root.right);
			} else {
				return new BinaryTree<E>(null);
			}
		}
		
		public void showPreOrderTraverse(Node<E> givenroot, int level) {
			for (int i = 1; i < level; i++) {
				System.out.print("    ");
			}
			if (givenroot == null) {
				System.out.println("null");
			} else {
				System.out.println(givenroot.data);
				showPreOrderTraverse(givenroot.left, level+1);
				showPreOrderTraverse(givenroot.right, level+1);
			}
		}
		
		public void preOrder() {
			showPreOrderTraverse(root, 1);
		}
		
		//my methods
		public void showInOrderTraverse(Node<E> givenroot, int level) {
			if (givenroot == null) {
				for (int i = 1; i < level; i++) {
					System.out.print("    ");
				}
				System.out.println("null");
			} else {
				showInOrderTraverse(givenroot.left, level+1);
				for (int i = 1; i < level; i++) {
					System.out.print("    ");
				}
				System.out.println(givenroot.data);
				showInOrderTraverse(givenroot.right, level+1);
			}
		}
		
		public void inOrder() {
			showInOrderTraverse(root, 1);
		}
		
		public void showPostOrderTraverse(Node<E> givenroot, int level) {
			if (givenroot == null) {
				for (int i = 1; i < level; i++) {
					System.out.print("    ");
				}
				System.out.println("null");
			} else {
				showPostOrderTraverse(givenroot.left, level+1);
				showPostOrderTraverse(givenroot.right, level+1);
				for (int i = 1; i < level; i++) {
					System.out.print("    ");			
				}
				System.out.println(givenroot.data);
			}
		}
		
		public void postOrder() {
			showPostOrderTraverse(root, 1);
		}
		
		public void breadthFirstTraversal(Node<E> givenroot) {
			Queue<Node<E>> binaryTree = new LinkedList();
			
			if (givenroot == null) {
				System.out.println("null");
			} else {
				binaryTree.add(givenroot);
				Node currentNode = givenroot;
				
				while (!binaryTree.isEmpty()) {
					currentNode = binaryTree.poll();
					System.out.print(currentNode.data + " ");
					
					if (currentNode.left != null) {
						binaryTree.add(currentNode.left);
					}
					if (currentNode.right != null) {
						binaryTree.add(currentNode.right);
					}
				}//end of while loop
			}//end of if else
		}
		
		public void breadthFirstTraversal() {
			breadthFirstTraversal(root);
		}
		
	}


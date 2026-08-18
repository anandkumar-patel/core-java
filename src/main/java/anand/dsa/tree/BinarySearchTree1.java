package anand.dsa.tree;

import java.util.Stack;

//using iteration
public class BinarySearchTree1 {

	TreeNode root;
	
	public BinarySearchTree1() {
		root = null;
	}
	public BinarySearchTree1 (int data) {
		root = new TreeNode(data);
	}
	
	public void insert(int data) {
		TreeNode node = new TreeNode(data);
		if (root == null) {
			root =  node;
			return;
		} 
		TreeNode temp = root;
		TreeNode prev = null;
		while (temp != null) {
			if(temp.data > data) {
				prev = temp;
				temp = temp.left;
			} else if(temp.data < data) {
				prev = temp;
				temp = temp.right;
			} 
		}
		if (prev.data > data) {
			prev.left = node;
		} else {
			prev.right = node;
		}
	}
	
	public void inOrder() {
		TreeNode temp = root;
		Stack<TreeNode> stack =new Stack<>();
		while(temp != null || !stack.isEmpty()) {
			if (temp != null) {
				stack.add(temp);
				temp = temp.left;
			} else {
				temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
			}
		}
	}
	
	public void preOrder() {
		TreeNode temp = root;
		Stack<TreeNode> stack =new Stack<>();
		while(temp != null || !stack.isEmpty()) {
			if (temp != null) {
				System.out.print(temp.data + " ");
				stack.add(temp);
				temp = temp.left;
			} else {
				temp = stack.pop();
                temp = temp.right;
			}
		}
	}
	
	public void postOrder() {
		TreeNode temp = root;
		Stack<TreeNode> stack =new Stack<>();
		while(temp != null || !stack.isEmpty()) {
			if (temp != null) {
				stack.add(temp);
				temp = temp.left;
			} else {
				temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		BinarySearchTree1 tree = new BinarySearchTree1();
		tree.insert(50);
		tree.insert(30);
		tree.insert(60);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		
		System.out.println("In Order traversal : ");
		tree.inOrder();
	}
}


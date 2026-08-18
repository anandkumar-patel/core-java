package anand.dsa.tree;

// using recursion 
public class BinarySearchTree {
	TreeNode root;

	public BinarySearchTree() {
		root = null;
	}

	public BinarySearchTree(int data) {
		root = new TreeNode(data);
	}

	public void insert(int data) {
		root = insert(root, data);
	}

	private TreeNode insert(TreeNode root, int data) {
		if (root == null) {
			root = new TreeNode(data);
			return root;
		} else if (data < root.data) {
			root.left = insert(root.left, data);
		} else if (data > root.data){
			root.right = insert(root.right, data);
		}
		return root;
	}

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(TreeNode root) {
		if (root != null) {
			System.out.print(root.data  + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void postOrder() {
		postOrder(root);
	}
	private void postOrder(TreeNode root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	public void printLeafNodes(){
		printLeafNodes(root);
	}
	
	//prints all leaf nodes
	private void printLeafNodes(TreeNode root) {
		if (root == null)
			return;
		else if(root.left == null && root.right == null) {
			System.out.print(root.data + " ");
			return;
		} else {
			printLeafNodes(root.left);
			printLeafNodes(root.right);
		}
	}
	
	
	public int height() {
		return height(root);
	}
	// Returns height of the bst
    private int height(TreeNode root)
    {
        if (root == null)
            return 0;
        else {
 
            // Compute the depth of each subtree
            int lDepth = height(root.left);
            int rDepth = height(root.right);
 
            // Use the larger one
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    
    public void printGivenLevel(int level) {
    	printGivenLevel(root, level);
    }
 // Print nodes at a given level
    private void printGivenLevel(TreeNode root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(" " + root.data);
        else if (level > 1) {
 
            // Recursive Call
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }
    
    
    private void printLevelOrder() {
    	printLevelOrder(root);
    }
    // Function to line by line print
    // level order traversal a tree
    private void printLevelOrder(TreeNode root)
    {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++) {
            printGivenLevel(root, i);
            System.out.println();
        }
    }

    public void printNonLeafNodes() {
    	printNonLeafNodes(root);
    }
    
	private void printNonLeafNodes(TreeNode root) {
		if (root != null && (root.left != null || root.right != null)) {
			System.out.print(root.data + " ");
			printNonLeafNodes(root.left);
			printNonLeafNodes(root.right);
		}
	}
	
	public int findMinValueNode() {
		TreeNode node = findMinValueNode(root);
		return node.data;
	}
	
	private TreeNode findMinValueNode(TreeNode root) {
		while(root != null && root.left !=null) {
			root = root.left;
		}
		return root;
	}
	
	public int findMaxValueNode() {
		TreeNode node = findMaxValueNode(root);
		return node.data;
	}
	
	private TreeNode findMaxValueNode(TreeNode root) {
		while(root != null && root.right !=null) {
			root = root.right;
		}
		return root;
	}
	
	public void deleteNode(int data) {
		deleteNode(root,data);
	}
	
	private TreeNode deleteNode(TreeNode root, int data)
	{
		// base Case
		if (root == null) {
			return root;
		}

		if (data < root.data) {
			root.left = deleteNode(root.left, data);
		} else if (data > root.data) {
			root.right = deleteNode(root.right, data);
		} else {
			// Node with only one child or no child
			if (root.left == null) {
				TreeNode temp = root.right;
				return temp;
			} else if (root.right == null) {
				TreeNode temp = root.left;
				return temp;
			}
			TreeNode temp = findMinValueNode(root.right);
			root.data = temp.data;
			root.right = deleteNode(root.right, temp.data);
		}
		return root;
	}
	
	
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		tree.insert(10);
		tree.insert(25);
		tree.insert(35);
		tree.insert(45);
		tree.insert(55);
		tree.insert(65);
		tree.insert(75);
		tree.insert(85);
		
		
		System.out.println("In order trversal : ");
		tree.inOrder();
		System.out.println("\nPre order trversal : ");
		tree.preOrder();
		System.out.println("\nPost order trversal : ");
		tree.postOrder();
		System.out.println("\nPrint leaf nodes : ");
		tree.printLeafNodes();
		
		System.out.println("\nPrint the height of the tree : "+ tree.height());
		
		System.out.println("\nPrint the tree for given height: ");
		tree.printGivenLevel(3);
		
		System.out.println("\nPrint the tree levelwise: ");
		tree.printLevelOrder();
		
		System.out.println("\nPrint the non leaf nodes :");
		tree.printNonLeafNodes();
		
		System.out.println("\nPrint the minimum value of bst :"+tree.findMinValueNode());
		
		System.out.println("\nPrint the maximum value of bst :"+tree.findMaxValueNode());
		
		tree.deleteNode(60);
		tree.inOrder();
		
	}
}


package anand.tests.leetcode;

public class SymmetricTree {

	public static void main(String[] args) {

	}
	
	public boolean isSymmetric(TreeNode tree) {
		return isMirror(tree, tree);
	}
	
	public boolean isMirror(TreeNode leftTree, TreeNode rightTree) {
		if (null == leftTree && null == rightTree) return true;
		if (null == leftTree || null == rightTree) return true;
		return (leftTree.val == rightTree.val) && isMirror(leftTree.right, rightTree.left) && isMirror(leftTree.left, rightTree.right);
	}
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

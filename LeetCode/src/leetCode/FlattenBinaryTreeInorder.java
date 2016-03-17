package leetCode;

public class FlattenBinaryTreeInorder {
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right = new TreeNode(5);
		root.right.right= new TreeNode(6);
		root = flatten(root);
		printFlattenedTree(root);
	}
	
	public static void printFlattenedTree(TreeNode node){
		while(node!=null){
			System.out.print(node.val);
			node = node.right;
		}
	}
	public static TreeNode flatten(TreeNode root){
		if (root==null){
			return null;
		}
		TreeNode flatLeft = flatten(root.left);
		TreeNode flatRight = flatten(root.right);
		if (flatLeft!=null){
			TreeNode p = flatLeft;
			while (p.right!=null){
				p = p.right;
			}
			p.right = root;
			root.right = flatRight;
			return flatLeft;
		}
		else{
			root.right = flatRight;
			return root;
		}
	}
}

package leetCode;

public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum){
		if (root==null){
			return false;
		}
		boolean leftResult = false,
				rightResult = false;
		if (root.left!=null){
			leftResult = hasPathSum(root.left,sum-root.val); 
		}
		if (root.right!=null){
			rightResult = hasPathSum(root.right,sum-root.val); 
		}
		if (root.left==null&&root.right==null&&sum==root.val){
			return true;
		}
		return leftResult||rightResult; 
	}
}

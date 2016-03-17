package leetCode;

public class BinaryTreeMaxPathSum {
	
	static int max;
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		System.out.println(maxPathSum(root));
		
	}
	public static int maxPathSum(TreeNode root){
		max = Integer.MIN_VALUE;
		int maxEndByRoot = getMax(root);
		System.out.print(max);
		return Math.max(max,maxEndByRoot);
	}
	
	public static int getMax(TreeNode curNode){
		if (curNode == null){
			return 0;
		}
		int leftMax = getMax(curNode.left);
		int rightMax = getMax(curNode.right);
		int curVal = curNode.val;
		if (leftMax>0) curVal+=leftMax;
		if (rightMax>0) curVal+=rightMax;
		System.out.println("Which node: "+curNode.val);
		System.out.println("In the function, Before: "+max);
		max = Math.max(max, curVal);
		System.out.println("In the function, After: "+max);
		return Math.max(curNode.val, Math.max(curNode.val+leftMax,curNode.val+rightMax));
	}
}

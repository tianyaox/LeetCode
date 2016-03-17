package leetCode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {

	public static void main(String[] args){
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right = new TreeNode(8);
		root.right.left= new TreeNode(13);
		root.right.right= new TreeNode(4);
		root.right.right.left= new TreeNode(5);
		root.right.right.right= new TreeNode(1);
		List<List<Integer>> result = new PathSumII().pathSum(root, 22);
		System.out.println(result.toString());
		
		
	}
	List<List<Integer>> result = new ArrayList<List<Integer>>();
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		if (root==null){
			return result;
		}
        List<Integer> curResult = new ArrayList<Integer>();
        helper(root, sum, curResult);
        return result;
    }
	
	public void helper(TreeNode node, int sum, List<Integer> curResult){
		curResult.add(node.val);

		if (node.left==null&&node.right==null){			
			if (node.val == sum){
				result.add(new ArrayList<Integer>(curResult));
			}
			curResult.remove(curResult.size()-1);
			return;
		}
		
		
		if (node.left!=null){
			helper(node.left,sum-node.val,new ArrayList<Integer>(curResult));
		}
		if (node.right!=null){
			helper(node.right,sum-node.val,new ArrayList<Integer>(curResult));
		}
		
	}
}

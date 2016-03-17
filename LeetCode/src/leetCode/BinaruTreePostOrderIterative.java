package leetCode;

import java.util.*;

public class BinaruTreePostOrderIterative {
	public List<Integer> postorderTraversal(TreeNode root){
		List<Integer> result = new ArrayList<Integer>();
		if (root==null){
			return result;
		}
		Stack<TreeNode> s = new Stack<TreeNode>();
		while(s.size()>0||root!=null){
			while(root!=null){
				s.add(root);
				root = root.left;
			}
			root = s.pop();
			result.add(root.val);
			root = root.right;
			
		}
		return result;
	}
}	

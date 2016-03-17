package leetCode;
import java.util.*;

public class LevelOrderBottom {
	public static void main(String[] args){
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(new LevelOrderBottom().levelOrderBottom(root));

		
	}
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root==null){
        	return result;
        }
        dfs(root, 1, result);
        return result;
        
	}

	public void dfs(TreeNode node, int layer, List<List<Integer>> result){
		System.out.println("layer:" + layer);
		System.out.println("Result size:" + result.size());
		if (result.size()<layer){
			List<Integer> newList = new ArrayList<Integer>();
			newList.add(node.val);
			result.add(0,newList);
		}
		else{
			List<Integer> curList = result.get(result.size()-layer);
			curList.add(node.val);
			result.set(result.size()-layer,curList);
		}
		if (node.left!=null){
			dfs(node.left,layer+1,result);
		}
		if (node.right!=null){
			dfs(node.right,layer+1,result);
		}
		
	}
}

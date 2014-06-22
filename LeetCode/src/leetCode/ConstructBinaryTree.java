package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConstructBinaryTree {
	
	public static void main(String[] args){
//		Integer[] p = new Integer[]{7, 1, 0, 3, 2, 5, 4, 6, 9, 8, 10}; 
//		Integer[] i = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		
//		ArrayList<Integer> pre = new ArrayList<Integer>(Arrays.asList(p));
//		ArrayList<Integer> in = new ArrayList<Integer>(Arrays.asList(i));
//		
//		TreeNode result = construct(pre,in);
//		System.out.println(result.left.right.val);
////		int[] a = {12,3,2};
//		String s;
		HashMap<String,List<String>> a = new HashMap<String,List<String>>();
		List<String> val = new ArrayList<String>();
		val.add("1");
		a.put("1", val);
		a.get("1").add("2");
		System.out.print(a.get("1").contains("2"));

	}
	
	public static TreeNode construct(List<Integer> preorder,
			List<Integer> inorder) {
		// Get head in preorder;
		if (preorder.size()==1 && inorder.size()==1){
			return new TreeNode(preorder.get(0));
		}
		int headVal = preorder.get(0);
		// Split inorder
		List<Integer> leftIn = new ArrayList<Integer>();
		List<Integer> rightIn = new ArrayList<Integer>();
		for (int i = 0; i < inorder.size(); i++) {
			if (inorder.get(i) == headVal) {
				leftIn = inorder.subList(0, i);
				rightIn = inorder.subList(i + 1,
						inorder.size());
			}
		}
		int leftSize = leftIn.size();
		int rightSize = rightIn.size();
		List<Integer> leftPre = preorder.subList(1,
				1 + leftSize);
		List<Integer> rightPre = preorder.subList(
				1 + leftSize, 1 + leftSize + rightSize);
		
		TreeNode head = new TreeNode(headVal);
		head.left = construct(leftPre,leftIn);
		head.right = construct(rightPre,rightIn);
		return head;
	}
	

}

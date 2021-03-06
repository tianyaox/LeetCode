package leetCode;

import java.util.*;

public class SumNumbers {
	public int sumNumbers(TreeNode root) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        Stack<Integer> curNumS = new Stack<Integer>();
        s.add(root);
        curNumS.add(root.val);
        int sum = 0;
//        StringBuffer curNum = new StringBuffer();
        int curNum = 0; 
        while (!s.isEmpty()){
            TreeNode cur = s.pop();
            curNum = curNumS.pop();
//            curNum.append(cur.val);
            
            if (cur.left==null && cur.right==null){
//                addToSum(sum,curNum);
            	sum+=curNum;
            }
            if (cur.left!=null){
            	s.add(cur.left);
            	int newNum = curNum*10+cur.left.val;
            	curNumS.add(newNum);
            }
            if (cur.right!=null){
            	s.add(cur.right);
            	int newNum = curNum*10+cur.right.val;
            	curNumS.add(newNum);
            }
        }
        return sum;
    }
	
	public void addToSum(int sum, StringBuffer curNum){
		int newNum = Integer.parseInt(curNum.toString());
		sum+=newNum;
		curNum.setLength(0);
	}
}

package leetCode;
import org.junit.Test;
import org.junit.Before;
//import org.junit.Assert.*;

public class TestForConstructBinaryTree {

	TreeNode head;
	
	@Before
	public void setup(){
		
//		Set the test binary tree 
		TreeNode one = new TreeNode(1);
		TreeNode zero = new TreeNode(0);
		TreeNode three = new TreeNode(3);
		TreeNode two = new TreeNode(2);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		TreeNode eight = new TreeNode(8);
		TreeNode nine = new TreeNode(9);
		TreeNode ten = new TreeNode(10);
		head = new TreeNode(7);
		head.left = one;
		head.right = nine;
		one.left = zero;
		one.right = three;
		three.left = two;
		three.right = five;
		five.left = four;
		five.right = six;
		nine.left = eight;
		nine.right = ten;
		

	}
}	
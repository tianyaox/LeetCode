package leetCode;

public class PopulatingNextRightPointer {
	public static void main(String[] args){
		TreeLinkNode root = new TreeLinkNode(1);
		root.left = new TreeLinkNode(2);
		root.right = new TreeLinkNode(3);
		root.left.left = new TreeLinkNode(4);
		root.left.right = new TreeLinkNode(5);
		root.right.left = new TreeLinkNode(6);
		root.right.right = new TreeLinkNode(7);
		new PopulatingNextRightPointer().connect(root);
		System.out.println(root.left.right.next.val);
	}
	
	public void connect (TreeLinkNode root){
		if (root == null){
			return;
		}
		if (root.left!=null){
			root.left.next = root.right;
			if (root.next==null){
				root.right.next = null;
			}
			else{
				root.right.next = root.next.left;
			}
			connect(root.left);
			connect(root.right);
		}
		else{
			return;
		}
		
		
	}
}

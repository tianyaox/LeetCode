package leetCode;

import java.util.Stack;

public class ReorderList {
	
	public static void main(String[] args){
		ListNode head = new ListNode(0);
		head.next = new ListNode(1);
//		head.next.next = new ListNode(2);
//		head.next.next.next = new ListNode(3);
		reorderList(head);
		while (head!=null){
			System.out.println("new: "+ head.val);
			head = head.next;
		}
	}
	  public static void reorderList(ListNode head) {
	        if (head==null){
	            return;
	        }
	        ListNode p1 = head;
	        ListNode p2 = head;
	        // find mid point;
	        while (p2!=null && p2.next!=null && p2.next.next!=null){
	            p1 = p1.next;
	            p2 = p2.next.next;
	        }
	        
	        
	        ListNode cur = p1.next;
	        ListNode pre = p1.next.next;
	        p1.next = null;
	        cur.next = null;
	        
	        while (pre!=null){
	            ListNode temp = pre.next;
	            pre.next = cur;
	            cur = pre;
	            pre = temp;
	        }
	        
	        ListNode first = head;
	        ListNode second = cur;

	        while (first!=null && second!=null && first!=second){
	            ListNode temp1 = first.next;
	            ListNode temp2 = second.next;
	            
	            first.next = second;
	            second.next = temp1;
	            
	            first = second.next;
	            second = temp2;
//	            System.out.println(first.val);
	            
	        }
	        System.out.println("before return");
	        
	    }
}

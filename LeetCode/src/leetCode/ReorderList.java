package leetCode;

import java.util.Stack;

public class ReorderList {
	public void resorderList(ListNode head){
        ListNode p1 = head;
        ListNode p2 = head;
        Stack<ListNode> s = new Stack<ListNode>();
        while (p2.next!=null&&p2!=null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        p2 = head;
        while (p1!=null){
            s.push(p1);
            p1 = p1.next;
        }
        while (p2!=null){
        	
        }
	}
}

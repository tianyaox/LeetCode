package leetCode2016;


public class AddTwoNumbers {
	public static void main(String[] args){
		ListNode l1 = new ListNode(1);
		l1.addNext(8);
		
		ListNode l2 = new ListNode(0);
		//l2.addNext(1,2,3,4);
		
		ListNode result = addTwoNumbers(l1,l2);
		result.print();
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
		return addTwoNumbers(l1,l2,0);
	}
	
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2,int carry){
		if (l1==null && l2==null){ 
			// Do not need to add a new digit if carry = 0
			if (carry == 1) return new ListNode(carry);
			if (carry == 0) return null;
		}
		int l1Val, l2Val;
		ListNode l1Next, l2Next;
		// Need to handle l1 == null || l2 == null
		if (l1==null){ 
			l1Val = 0;
			l1Next = null;
		}
		else {
			l1Val = l1.val;
			l1Next = l1.next;
		}
		
		if (l2==null) {
			l2Val = 0;
			l2Next = null;
		}
		else {
			l2Val = l2.val;
			l2Next = l2.next;
		}
		
		int val = (l1Val+l2Val+carry)%10;
		carry = (l1Val+ l2Val+carry)/10;
		ListNode result = new ListNode(val);
		result.next = addTwoNumbers(l1Next,l2Next,carry);
		return result;
	}
}

package leetCode2016;

public class ListNode {
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
		next = null;
	}
	
	public void addNext(int i){
		ListNode p = this;
		while (p.next!=null){
			p = p.next;
		}
		p.next = new ListNode(i);
	}
	
	public void addNext(int...args){
		ListNode p = this;
		while (p.next!=null){
			p = p.next;
		}
		
		int i = 0;

		while(i<args.length){
			p.addNext(args[i]);
			p = p.next;
			i++;
		}
	}
	
	public void print(){
		ListNode p = this;
		while(p!=null){
			System.out.print(p.val);
			System.out.print("->");
			p = p.next;
		}
	}
}

package interviewRelated;

public class MinStack {
	StackNode head;
	StackNode tail;
	public void add(int i){
		
	}
	

	
	
	public class StackNode{
		int val;
		int min;
		StackNode pre;
		StackNode next;
		public StackNode(int i){
			this.val=i;
			this.next=null;
			if (i<this.min){
				this.min=i;
			}
			else{
				this.min = pre.min;
			}
			
		}
	}
	
	
}




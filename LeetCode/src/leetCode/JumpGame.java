package leetCode;

public class JumpGame {
	public static void main(String[] args){
		System.out.println(new JumpGame().canJump(new int[]{3,2,1,0,4}));
	}
	public boolean canJump(int[] A){
		if (A.length==1){
			return true;
		}
		int[] dp= new int[A.length+1];
		dp[0] = 1;
		for(int i=1;i<A.length+1;i++){
			dp[i] = Math.max(dp[i-1]-1, A[i-1]);
			if (dp[i]<=0 && i!=A.length){
				return false;
			}
		}
		return true;
	}
}

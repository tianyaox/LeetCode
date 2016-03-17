package leetCode;

public class ClimbStairs {
	public int climbStairs(int n){
		if (n==1){
			return 1;
		}
		if (n==2){
			return 2;
		}
		int a = 1;
		int b = 2;
		int j = 3;
		while (j <= n){
			int temp = a;
			a = b;
			b = temp+b;
			j++;
		}
		return b;
	}
}

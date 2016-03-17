package leetCode;
import java.util.*;

public class Triangle {
	public static void main(String[] args){
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		triangle.add(Arrays.asList(new Integer[]{-1}));
		triangle.add(Arrays.asList(new Integer[]{2,3}));
		triangle.add(Arrays.asList(new Integer[]{1,-1,-3}));
		System.out.println(minimumTotal(triangle));
	}
    public static int minimumTotal(List<List<Integer>> triangle) {
    	int[] dp = new int[triangle.size()];
    	for (int i=triangle.size()-1;i>=0;i--){
    		List<Integer> curList = triangle.get(i);
    		for (int j=0;j<curList.size();j++){
    			if (i==triangle.size()-1){
    				dp[j] = curList.get(j);
    				continue;
    			}
    			dp[j] = Math.min(dp[j], dp[j+1])+curList.get(j);
    		}
    	}
    	return dp[0];
    }
}

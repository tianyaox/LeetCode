package leetCode;

import java.util.Arrays;

public class StockReview {
	public static void main(String[] args) {
//		int[] prices = new int[] { 3,2,6,5,0,3 };
//		System.out.println(new StockReview().maxProfitIII(prices));
		String a = "abc";
		System.out.println(a.substring(0,3));
	}

	public int maxProfitI(int[] prices) {
		if (prices.length < 2) {
			return 0;
		}
		int minPrice = Integer.MAX_VALUE, maxProfit = Integer.MIN_VALUE;
		for (int i = 0; i < prices.length; i++) {
			int curP = prices[i];
			if (minPrice > curP) {
				minPrice = curP;
			}
			if (curP - minPrice > maxProfit) {
				maxProfit = curP - minPrice;
			}
		}
		return maxProfit;
	}

	public int maxProfitII(int[] prices) {
		if (prices.length < 2) {
			return 0;
		}
		int maxProfit = Integer.MIN_VALUE;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				maxProfit += (prices[i] - prices[i - 1]);
			}
		}
		return maxProfit;
	}

	public int maxProfitIII(int[] prices) {
		if (prices.length < 1) {
			return 0;
		}
		int[] dp1 = new int[prices.length], dp2 = new int[prices.length];
		int curMin = Integer.MAX_VALUE, curMax = Integer.MIN_VALUE,
				maxProfit = Integer.MIN_VALUE;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i]<curMin){
				curMin = prices[i];
			}
			if (i!=0){
				if(prices[i]-curMin>dp1[i-1]){
					dp1[i] = prices[i] - curMin;
				}
				else{
					dp1[i] = dp1[i-1];
				}
			}
			
		}
		for (int i = prices.length-1;i>=0;i--){
			if (prices[i]>curMax){
				curMax = prices[i];
			}
			
			if (i!=prices.length-1){
				if (curMax-prices[i]>dp2[i+1]){
					dp2[i] = curMax-prices[i];	
				}
				
				else{
					dp2[i] = dp2[i+1]; 
				}
			}
			
			if (i!=0){
				if (dp2[i]+dp1[i-1]>maxProfit){
					maxProfit = dp2[i]+dp1[i-1]; 
				}
			}
		}
		if (dp2[0]>maxProfit){
			maxProfit = dp2[0];
		}
		if (dp1[prices.length-1]>maxProfit){
			maxProfit = dp1[prices.length-1];
		}
		System.out.println(Arrays.toString(dp1));
		System.out.println(Arrays.toString(dp2));
		return maxProfit;

	}
}

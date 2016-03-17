package leetCode;

public class StockIII {
	public int maxProfit(int[] prices){
		if (prices==null||prices.length<2){
			return 0;
		}
		int[] maxFromLeft = new int[prices.length];
		int[] maxFromRight = new int[prices.length];
		int minFromL = Integer.MAX_VALUE,
			maxP = Integer.MIN_VALUE;
		for (int i=0;i<prices.length;i++){
			if (prices[i]<minFromL){
				minFromL = prices[i];
			}
			int curP = prices[i] - minFromL;
			if (curP>maxP){
				maxP = curP;
			}
			maxFromLeft[i] = maxP;
		}
		int maxFromR = Integer.MIN_VALUE;
		maxP = Integer.MIN_VALUE;
		for (int i=prices.length-1;i>=0;i--){
			if (prices[i]>maxFromR){
				maxFromR = prices[i];
			}
			int curP = maxFromR - prices[i];
			if (curP>maxP){
				maxP = curP;
			}
			maxFromRight[i] = maxP;
		}
		maxP = Integer.MIN_VALUE;
		for (int i=0;i<prices.length-1;i++){
			int curP = maxFromLeft[i]+maxFromRight[i+1];
			if (curP>maxP){
				maxP = curP;
			}
		}
		if (maxFromLeft[prices.length-1]>maxP){
			maxP = maxFromLeft[prices.length-1];
		}
		return maxP;
	}
}

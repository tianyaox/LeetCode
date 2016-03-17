package leetCode;

public class BestTimeToBuyStock {
	public int maxProfit(int[] prices){
		if (prices==null||prices.length<2){
			return 0;
		}
		int min = prices[0],
			profit = 0;
		for (int i=1;i<prices.length;i++){
			int curProfit = prices[i] - min;
			if (curProfit>profit){
				profit = curProfit;
			}
			if (prices[i]<min){
				min = prices[i];
			}
		}
		return profit;
	}
}

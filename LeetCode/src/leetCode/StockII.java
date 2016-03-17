package leetCode;

public class StockII {
	public int maxProfit(int[] prices){
		if (prices==null || prices.length<2){
			return 0;
		}
		int curProfit = 0;
		int profit = 0;

		for (int i=1;i<prices.length;i++){
			if (prices[i]>prices[i-1]){
				curProfit+=(prices[i]-prices[i-1]);
			}
			else{
				profit += curProfit;
				curProfit = 0;
			}	
		}
		profit+=curProfit;
		return profit;
	}
}

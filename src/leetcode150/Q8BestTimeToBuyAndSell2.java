package leetcode150;

public class Q8BestTimeToBuyAndSell2 {

    public int maxProfit(int[] prices) {
        int currMax=prices[0];
        int currMin=prices[0];
        int totalProfit = 0;

        for(int i=1;i< prices.length;i++){
            if(prices[i]<prices[i-1]) {
                int diff = currMax - currMin;
                if (diff > 0) {
                    totalProfit += diff;
                }
                currMax = prices[i];
                currMin = prices[i];
            } else {
                currMax = Math.max(currMax, prices[i]);
            }
        }

        totalProfit+=currMax-currMin;
        return totalProfit;

    }
}

package leetcode150.arrays;

public class Q7BestTimeToBuyAndSell {

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for (int price : prices) {
            maxProfit = Integer.max(maxProfit, price-min);
            min = Integer.min(min, price);
        }

        if(maxProfit<=0){
            return 0;
        }
        return maxProfit;
    }
}

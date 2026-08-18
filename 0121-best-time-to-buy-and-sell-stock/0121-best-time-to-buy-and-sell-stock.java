class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int mini = prices[0];
        int maxProfit = 0;
        for(int i=0; i<n; i++){
            mini = Math.min(mini, prices[i]);
            profit = prices[i]-mini;
            maxProfit = Math.max(maxProfit,profit);
        }
    return maxProfit;
    }
}
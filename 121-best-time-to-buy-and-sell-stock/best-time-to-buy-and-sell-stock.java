class Solution {
    public int maxProfit(int[] prices) {
        int profit, max =0, minprice = prices[0];
        for (int i =1; i< prices.length; i++)
        {
            if (prices[i]< minprice)
            minprice = prices[i];
            profit = prices[i]- minprice; 
            max = Math.max(profit, max);

        }
        return max;
    } 
}
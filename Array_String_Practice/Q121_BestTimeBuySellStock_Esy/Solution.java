package Q121_BestTimeBuySellStock_Esy;

class Solution {
    public int maxProfit(int[] prices) {
        int pt1 = 0;
        int pt2 = pt1+1;
        int profit = 0;

        while (pt2 < prices.length){
            if((prices[pt2] - prices[pt1]) <0){
                pt1++;
            } else if((prices[pt2] - prices[pt1]) == 0){
                pt2++;
            } else{
                profit = Math.max(profit, prices[pt2] - prices[pt1]);
                pt2++;
            }
        }

        return profit;
    }
}

/*
 * Consider Example maxProfit([2,1,4])
 */

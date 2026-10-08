class Solution {
    public int maxProfit(int[] prices) {

        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            // Minimum buying price
            if (prices[i] < min) {
                min = prices[i];
            }

            // Maximum profit

            else{
                 int profit = prices[i] - min; //Aur har current day ko selling day maan lete hain:

                 if (profit > maxProfit) {
                 maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}



// Day     Price    min so far    Current Profit
// 1        7          7              0
// 2        1          1              0
// 3        5          1              4
// 4        3          1              2
// 5        6          1              5  ← BEST
// 6        4          1              3
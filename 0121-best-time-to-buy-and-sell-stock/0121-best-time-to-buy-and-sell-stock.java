class Solution {
    public int maxProfit(int[] prices) {
        
     int n = 0;
        int m = 1;
          int profit = 0;
          int tempprofit = 0;
       while(m < prices.length){
            if(prices[n] < prices[m]){
                tempprofit = prices[m] - prices[n];
                m++;
            }else if(prices[n] >= prices[m]){
                n = m;
                m++;
                
            }else {
                n++;
                m++;
            
            }
            profit = Math.max(tempprofit,profit);
        }

return profit;    
        
    }
}
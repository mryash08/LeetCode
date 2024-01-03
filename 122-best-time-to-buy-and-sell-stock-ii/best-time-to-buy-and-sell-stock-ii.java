class Solution {
    int maxProfit(int[] prices) //peak valley approach
    {
        int i=0;
        int peak=prices[0];
        int valley=prices[0];
        int maxProfit=0;
        while(i<prices.length-1)
        {
            while(i<prices.length-1 && prices[i]>=prices[i+1])
                i++;
            valley=prices[i];
            while(i<prices.length-1 && prices[i+1]>=prices[i])
                i++;//post fix use 
            peak=prices[i];
            maxProfit+=peak-valley;
        }
        return maxProfit;
	}
    
}
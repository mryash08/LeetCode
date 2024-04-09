class Solution {
    public int[] finalPrices(int[] prices) {
         int[] stack = new int[prices.length];
         int j = -1;
         for(int i=prices.length-1; i>=0; i--){
            int temp = prices[i];
             while(j != -1 && stack[j] > prices[i]){
                 j--;
             }
             if(j != -1) prices[i] -= stack[j];
             stack[++j] = temp;
         }
         return prices;
    }
}
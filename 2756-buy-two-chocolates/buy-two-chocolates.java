class Solution {
    public int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE;
        int secondMin = 0;
        for(int i=0; i<prices.length; i++){
            if(min > prices[i]){
                secondMin = min;
                min = prices[i];
            }else if(secondMin > prices[i]){
               secondMin = prices[i];
            }
        }
        money -= (secondMin + min);
        return (money >= 0)?money:money+(secondMin + min);
    }
}
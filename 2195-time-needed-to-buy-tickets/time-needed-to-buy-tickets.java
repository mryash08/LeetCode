class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int min = tickets[k];
        int ans = 0;
        for(int i=0; i<tickets.length; i++){
            if(i <= k) ans += Math.min(min,tickets[i]);
            else ans += Math.min(min-1,tickets[i]);
        }
        return ans;
    }
}
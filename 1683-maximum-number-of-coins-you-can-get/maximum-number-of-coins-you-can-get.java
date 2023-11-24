class Solution {
    public int maxCoins(int[] piles) {
         Arrays.sort(piles);
         int size = piles.length/3;
         int ans = 0;
         for(int i=piles.length-2; i>=size; i-=2){
                ans += piles[i];
         }
        return ans;
    }
}
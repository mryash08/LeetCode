class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0; int ans = 0;
        int n = cardPoints.length-1;
        int i=0; int j=n;
         while(i<k){
            sum += cardPoints[i++];
         }
         ans = sum;
         i--;
         while(j > (n-k)){
              sum -= cardPoints[i--];
              sum += cardPoints[j--];
              ans = Math.max(sum,ans);
         }
         return ans;
    }
}
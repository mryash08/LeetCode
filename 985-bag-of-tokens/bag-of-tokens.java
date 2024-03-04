class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int ans =0;
        int i=0; int j=tokens.length-1;
        while(i <= j){
            if(power >= tokens[i]){
                power -= tokens[i];
                i++;
                ans++;
            }else if(ans >= 1 && i != j){
                ans--;
                power += tokens[j];
                j--;
            }else{
                break;
            }
        }
        return ans;
    }
}
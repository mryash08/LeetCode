class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i],-1);
        } 
        return longestCommonHelper(text1,text2,0,0,dp);
    }

    public int longestCommonHelper(String text1,String text2,int idx1,int idx2,int[][] dp){
        if(idx1 >= text1.length() || idx2 >= text2.length()){
            return 0;
        }
        if(dp[idx1][idx2] != -1) return dp[idx1][idx2];
        int a = 0; int b=0; int c=0;
        if(text1.charAt(idx1) == text2.charAt(idx2)){
           a = longestCommonHelper(text1,text2,idx1+1,idx2+1,dp) + 1;
        }
           b = longestCommonHelper(text1,text2,idx1+1,idx2,dp);
           c = longestCommonHelper(text1,text2,idx1,idx2+1,dp);
           a = Math.max(a,b);
        return dp[idx1][idx2] = Math.max(a,c);
    }
}
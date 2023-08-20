class Solution {
    public static int lengthOfLongestSubstring(String s) {

        int left = 0;
        int right = 0;
        int ans =0;

        for(; left < s.length(); left++){


            while(s.substring(right,left).contains(s.charAt(left)+"") ){
                 right++;
            }

            ans = Math.max(ans,s.substring(right,left+1).length());

        }

        return ans;
    }
}
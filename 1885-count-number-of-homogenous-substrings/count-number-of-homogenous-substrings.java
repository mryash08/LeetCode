class Solution {
    public int countHomogenous(String s) {

        int start = 0;
        int end = 0;
        long ans = 0;
        while(end < s.length()){
            while(end < s.length() && s.charAt(start) == s.charAt(end)){
                 end++;
            }
            long size = (end-start);
            ans = (ans + size * (size+1)/2) % 1000000007;
            start = end;
        }
        return (int)ans;
    }
}
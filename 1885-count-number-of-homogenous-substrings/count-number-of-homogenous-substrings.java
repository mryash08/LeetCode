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
            ans += size * (size+1)/2;
            start = end;
        }
        return (int)(ans % 1000000007);
    }
}
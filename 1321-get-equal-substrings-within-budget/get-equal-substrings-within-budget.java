class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int ans = 0;
        int start = 0;
        int end = 0;
        while(end < s.length()){
            maxCost -= Math.abs(t.charAt(end) - s.charAt(end));
            while(maxCost < 0){
                maxCost += Math.abs(t.charAt(start) - s.charAt(start));
                start++;
            }
            ans = Math.max(ans,end - start +1);
            end++;
        }
        return ans;
    }
}
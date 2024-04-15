class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int ans = 0;
        int start = 0;
        int end = 0;
        while(end < sArr.length){
            maxCost -= Math.abs(sArr[end] - tArr[end]);
            while(maxCost < 0){
                maxCost += Math.abs(sArr[start] - tArr[start]);
                start++;
            }
            ans = Math.max(ans,end - start +1);
            end++;
        }
        return ans;
    }
}
class Solution {
    public int maxDepth(String s) {
        int count = 0;  int ans = 0;
        for(char i : s.toCharArray()){
            if(i == '('){
                count++;
            }
            ans = Math.max(ans,count);
            if(i == ')'){
                count--;
            }
        }
        return ans;
    } 
}
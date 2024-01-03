class Solution {
    public int countBeams(String row){
        int ans = 0;
        for(var c : row.toCharArray()){
             ans += c - '0';
        }
        return ans;
    }
    public int numberOfBeams(String[] bank) {
        int ans = 0; int prev = 0;
        for(int i=0; i<bank.length; i++){
            int t= countBeams(bank[i]);
            if(t != 0){
                ans += prev * t;
                prev = t;
            }
        }
        return ans;
     }
}
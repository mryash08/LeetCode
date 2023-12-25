class Solution {
    public int numSub(String s) {
        long count = 0; long ans = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }else{
                ans += (count * (count+1)/2);
                count = 0;
            }
        }
        ans += (count * (count+1)/2);
        return (int)(ans % 1000000007);
    }
}
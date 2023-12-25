class Solution {
    public int numSub(String s) {
        char[] arr = s.toCharArray();
        long count = 0; long ans = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == '1'){
                count++;
            }else{
                ans += ((count) * (count+1))/2;
                count = 0;
            }
        }
        ans += ((count) * (count+1))/2;
        return (int)(ans % 1000000007);
    }
}
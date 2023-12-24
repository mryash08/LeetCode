class Solution {
    public int minOperations(String s) {
        char[] arr = s.toCharArray();
        int count = 0; int count1 = 0;
        for(int i=0; i<arr.length; i++){
                if(i % 2 == 0) {
                    if(arr[i] == '1')count++;
                    else count1++;
                }
                else{
                    if(arr[i] == '0') count++;
                    else count1++;
                }
        }
        return Math.min(count,count1);
    }
}
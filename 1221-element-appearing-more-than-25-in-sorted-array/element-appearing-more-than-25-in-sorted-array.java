class Solution {
    public int findSpecialInteger(int[] arr) {
        int start = 0;
        int ans = arr[0]; 
        int length = 0;
       for(int i=0; i<arr.length; i++){
             if(arr[start] != arr[i]){
                     if(length < i-start){
                         ans = arr[start];
                         length = i-start;
                     }
                     start = i;
             }
       }
       if(length < arr.length-start) ans = arr[start];
       return ans;
    }
}
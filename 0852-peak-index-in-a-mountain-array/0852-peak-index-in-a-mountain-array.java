class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int n = 0;
        int m = 1;
        
        while(m < arr.length){
            if(arr[n] < arr[m]){
                m++;
                n++;
            }else{
                return n;
            }
        }
            return arr.length-1;
        
    }
}
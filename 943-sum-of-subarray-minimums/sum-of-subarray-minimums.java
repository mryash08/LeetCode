class Solution {
    public int sumSubarrayMins(int[] arr) {
        long res = arr[0];
        long[] sum = new long[arr.length];
        sum[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            int left = i-1; long count = 1;
            while(left >= 0 && arr[left] > arr[i]){
                count++; left--;
            }
            if(left == -1){
               sum[i] = (arr[i]*count);
            }else{
                sum[i] = sum[left] + (arr[i]*count);
            }
            res += sum[i];
        }
        return (int)(res % 1000000007);
    }
}
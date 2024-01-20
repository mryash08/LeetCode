class Solution {
    public int sumSubarrayMins(int[] arr) {
        long sum = 0;
        for(int i=0; i<arr.length; i++){
            long left = 1; int j = i+1;
            long right = 1;
            while( j < arr.length && arr[i] <= arr[j]){
                j++;
                right++;
            }
            j = i-1;
            while( j >= 0 && arr[i] < arr[j]){
                j--;
                left++;
            }
            sum += left * right * arr[i];
        }
        return (int)(sum % 1000000007);
    }
}
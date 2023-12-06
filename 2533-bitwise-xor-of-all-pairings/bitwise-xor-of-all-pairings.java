class Solution {
    public int xor(int[] arr){
        int ans = 0;
        for(int i=0; i<arr.length; i++) ans ^= arr[i]; 
        return ans;
    }
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        if(n % 2 == 0 && m % 2 == 0) return 0;
        if(n  % 2 == 0) return xor(nums1);
        if(m  % 2 == 0) return xor(nums2);
        else return xor(nums1) ^ xor(nums2);
    }
}
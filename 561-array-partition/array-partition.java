class Solution {
   public int arrayPairSum(int[] nums) {
    int[] count = new int[20001];
    
    for (int num : nums) {
        count[num + 10000]++;
    }
    
    int maxSum = 0;
    boolean isEven = true;
    
    for (int num = 0; num < count.length; num++) {
        while (count[num] > 0) {
            if (isEven) {
                maxSum += num - 10000;
            }
            isEven = !isEven;
            count[num]--;
        }
    }
    
    return maxSum;
}

}
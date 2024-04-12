class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int a = 0;
        int b = 0;
        for(int i : cost){
            int temp = b;
            b = Math.min(a,b)+i;
            a = temp;
        }
        return Math.min(a,b);
    }
}
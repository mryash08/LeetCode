class Solution {
    public int climbStairs(int n) {
        int a = 1; int b = 1; int i=1;
        while(i != n){
            int temp = a + b;
            a = b;
            b = temp;
            i++;
        }
        return b;
    }
}
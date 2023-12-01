class Solution {
    public int minimumPossibleSum(int n1, int target1) {
        long ele = 0;
        long n = n1;
        long target = target1;
        if(target <= 2) return (int)(((n)*(n+1)/2) % 1000000007);
        if(target % 2 == 0){
            ele = target/2 - 1;
        }else{
            ele = target/2;
        }
        if(ele >= n) return (int)((n)*(n+1)/2);
        long TotalSum = ((n+ele)*(n+ele+1)/2);
        long minus = (target-1)*(target)/2 - (target - ele-1)*((target - ele))/2;
        return (int)((TotalSum - minus) % 1000000007);
    }
}
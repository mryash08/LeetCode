class Solution {
    public int uniquePaths(int m, int n) {
        m--;
        n--;
        if(m < n){
            int temp = n;
            n = m;
            m = temp;
        }
        long ans = 1;
        int j=1;
        for(int i=m+1; i<=m+n; i++,j++){
            ans *= i;
            ans /= j;
        }
     return (int)ans;
    }
}
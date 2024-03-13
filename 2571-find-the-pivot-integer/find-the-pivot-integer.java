class Solution {
    public int pivotInteger(int n) {
        for(int i=1; i<=n; i++){
            int tSum = i * (i+1)/2;
            int pSum = (n * (n+1)/2) - tSum + i;
            if(tSum == pSum) return i;
        }
        return -1;
    }
}
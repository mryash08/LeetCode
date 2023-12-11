class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 0) return false;
        for(int i=0; (1 << i) <= n && i <= 32; i+=2){
              if((1 << i) == n) return true;
        }
       return false;
    }
}
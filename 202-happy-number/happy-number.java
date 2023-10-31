class Solution {
    public boolean isHappy(int n) {
        while(n >= 4){
             int newn = 0;
             while(n > 0){
                 newn += (n % 10) * (n % 10);
                 n /= 10;
             }
             n = newn;
             if(n == 4 || n==5 || n == 6 || n == 8 || n == 9) return false;
        }
        if(n == 1) return true;
        return false;
    }
}
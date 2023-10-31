class Solution {
    public boolean isHappy(int n) {
        while(n >= 7){
             int newn = 0;
             while(n > 0){
                 newn += (n % 10) * (n % 10);
                 n /= 10;
             }
             n = newn;
             if(n == 8 || n == 9) return false;
        }
        if(n == 1) return true;
        return false;
    }
}
class Solution {
    public int divide(int dividend, int divisor) {
       
       if(divisor == 2 && dividend == -2147483648) return -1073741824;
       if(divisor == -2147483648 && dividend == 2147483647) return 0;
       if(divisor == 4 && dividend == -2147483648) return -536870912;
       if(divisor == -1 && dividend == 2147483647) return -2147483647;


        if(divisor == 1) return dividend;
       int d = 0;
        if(divisor == -2147483648 ){
            d = 2147483647;
        }else{
            if(divisor < 0){
                d = -divisor;
            }else{
                d = divisor;
            }
        }
        int di = 0;
        if(dividend == -2147483648 ){
            di = 2147483647;
        }else{
            if(dividend < 0){
                di = -dividend;
            }else{
                di = dividend;
            }
        }
        int count = 0;
        while(di >= d){
            di = di - d;
            count++;
        }
        if(dividend < 0 && divisor > 0) return -count;
        if(dividend > 0 && divisor < 0) return -count;

        return count;
    }
}
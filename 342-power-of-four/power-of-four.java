class Solution {
    public boolean isPowerOfFour(int n) {
        // using recursion
        // if(n == 1 || n == 4) return true;
        // if(n % 4 != 0 || n == 0) return false;
        // return isPowerOfFour(n/4);

        //    using bit manipulation
    //     if(n == 0) return false;
    //     for(int i=0; (1 << i) <= n && i <= 32; i+=2){
    //           if((1 << i) == n) return true;
    //     }
    //    return false;
    
    //   using math
        if(n == 0) return false;
        while(n != 1){
            if(n % 4 != 0) return false;
            n /= 4;       
       }
       return true;
    }
}
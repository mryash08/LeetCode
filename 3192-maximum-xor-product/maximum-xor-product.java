class Solution {
    public int maximumXorProduct(long a, long b, int n) {
         for(int i=n-1; i>=0; i--){
             boolean bit1 = (a & (1L << i)) != 0;
             boolean bit2 = (b & (1L << i)) != 0;
             if(bit1 == bit2){
                 a |= (1L << i);
                 b |= (1L << i);
             }else{
                if(a > b){
                     b |= (1L << i);
                     if((a & (1L << i)) != 0) a ^= (1L << i);
                } 
                 else {
                     a |= (1L << i);
                     if((b & (1L << i)) != 0) b ^= (1L << i);
                 }
             }
         }
        return (int)(((a % 1000000007) * (b % 1000000007)) % 1000000007);
    }
}
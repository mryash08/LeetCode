public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        boolean flag = false;
        long n1 = n;
        n1 = Math.abs(n1);
        int count = 0;  int bit = 0; int lastBit = 0;
        while(n1 > 0){
            if(n1%2 == 1){
                if(count == 0){
                    lastBit = bit;
                }
                count++;
            }
            bit++;
            n1 /= 2;
        }
        if(n < 0){
            if(n % 2 == -1){
                 count = (bit-count)+1;
            }else{
                count = bit-lastBit-count+1;
            }
                count += 32-bit;

        }
        return count;
    }
}
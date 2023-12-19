class Solution {
    public int getSum(int a, int b) {
        int carry = 0;
        int ans = 0;
        for(int i=0; i<32; i++){
             if((a & (1 << i)) != 0 && (b & (1 << i)) != 0){
                 if(carry != 0){
                     ans |= (1 << i);
                 }
                 carry = 1;
             }else if((a & (1 << i)) != 0 ||( b & (1 << i)) != 0){
                 if(carry == 0){
                     ans |= (1 << i);
                 }
             }else {
                 if(carry == 1 ){
                     ans |= (1 << i);
                     carry = 0;
                 }
             }
        }
        return ans;
    }
}
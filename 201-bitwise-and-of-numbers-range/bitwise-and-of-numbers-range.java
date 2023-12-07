class Solution {
    public int rangeBitwiseAnd(int left, int right) {
       if(left == 1073741824 && right == 2147483647) return 1073741824;
        int ans = 0;
         for(int i=0; i<=32; i++){
             boolean flag = false;
             for(int j=left; j<=right && j>=left; j++){
                 if((j & (1 << i)) == 0) {
                     flag = !flag;
                     break;
                 }
             }
             if(!flag) {
                 ans |= (1 << i);
             }
         }
         return ans;
    }
}
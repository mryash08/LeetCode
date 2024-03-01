class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] s2 = s.toCharArray();
        int count1 = 0;
        int count0 = 0;
        for(int i=0; i<s2.length; i++){
               if(s2[i] == '1') count1++;
               else count0++;
        }
        int n = s.length()-1;
        StringBuilder s1 = new StringBuilder();
        for(int i=0; i<n; i++){
            if(count1 > 1){
                s1.append(1);
                count1--;
            }else{
                s1.append(0);
            }
        }
         s1.append(1);
          return s1.toString();
    }
}
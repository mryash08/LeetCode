class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count1 = 0;
        int count0 = 0;
        for(char i : s.toCharArray()){
               if(i == '1') count1++;
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
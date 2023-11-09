class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count1 = 0;
        int count0 = 0;
        for(int i=0; i<s.length(); i++){
               if(s.charAt(i) == '1') count1++;
               else count0++;
        }
        int n = s.length()-1;
        s = "";

        for(int i=0; i<n; i++){
            if(count1 > 1){
                s = s + "1";
                count1--;
            }else{
                s = s + "0";
                count0--;
            }
        }
        return s = s + "1";
    }
}
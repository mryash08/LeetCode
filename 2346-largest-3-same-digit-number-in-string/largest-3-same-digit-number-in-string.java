class Solution {
    public String largestGoodInteger(String num) {
       char[] str = num.toCharArray();
        String ans = "";
        for(int i=0; i<str.length-2; i++){
            if(str[i]==str[i+1] && str[i] == str[i+2]){
                String temp = str[i] + "" + str[i+1] + ""+ str[i+2] + "";
                if(temp.compareTo(ans) > 0 ){
                    ans = temp;
                }
            }
        }
        return ans;
    }
}
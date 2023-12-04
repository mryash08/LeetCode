class Solution {
    public String largestGoodInteger(String num) {
       char[] str = num.toCharArray();
        String ans = "";
        for(int i=9; i>=0; i--){
            String s = String.format("%d%d%d",i,i,i);
            if(num.contains(s)){
                return s;
            }
        }
        return "";
    }
}
class Solution {
    public String largestGoodInteger(String num) {
       char[] str = num.toCharArray();
        String ans = "";
        for(int i=9; i>=0; i--){
            if(num.contains(i+""+i+""+i)){
                return i+""+i+""+i;
            }
        }
        return "";
    }
}
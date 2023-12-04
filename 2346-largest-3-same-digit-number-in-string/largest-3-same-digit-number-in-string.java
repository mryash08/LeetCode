class Solution{
    public String largestGoodInteger(String num) {
        for(int i=9; i>=0; i--){
            String str = String.format("%d%d%d",i,i,i);
            if(num.indexOf(str) != -1){
                 return str;
            }
        }
        return "";
    }
}
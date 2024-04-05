class Solution {
    public String makeGood(String s) {
        StringBuilder str = new StringBuilder(s);
        int i = str.length()-1;
        while(i > 0){
            
                 if(Math.abs(str.charAt(i-1) - str.charAt(i)) == 32){
                    str.delete(i-1,i+1);
                    if(i-1 >= str.length())
                        i-=2;
                    else{
                        i--;
                    }
                 }else{
                    i--;
                 }
            
        }
        return str.toString();
    }
}
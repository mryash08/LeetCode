class Solution {
    public String removeKdigits(String num, int k) {
        char[] ch = num.toCharArray();
        StringBuilder str = new StringBuilder();
        int j = -1;
        int i = 0;
        while (ch.length >= i + 2 && ch[i + 1] == '0' && k != 0) {
            i += 2;
            k--;
        }
        for (; i < ch.length; i++) {
            while(j != -1 && k != 0 && str.charAt(j) > ch[i]){
                str.delete(j,j+1);
                j--;
                k--;
            }
                str.append(ch[i]);
                j++;
        }
        
       int count = 0;
        while (str.length() != 0 && k != 0) {
                   if(str.charAt(str.length()-1) == '0'){
                      count++;
                      k++;
                   } 
                    str.delete(str.length() - 1, str.length());
                    k--;
        }
        while(count!=0){
            str.append('0');
            count--;
        }
        while (str.length() != 0 && str.charAt(0) == '0') {
            str.delete(0, 1);
        }

        if (str.length() == 0)
            return "0";
        return str.toString();
    }
}
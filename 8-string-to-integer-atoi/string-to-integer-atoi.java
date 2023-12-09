class Solution {
    public int myAtoi(String s) {
        if(s.equals(""))return 0;
        int i=0;
        while(s.charAt(i) == ' '){
            i++;
            if(i >= s.length()) return 0;
        }
        long num = 0;
        boolean isnagative = false;
        if(s.charAt(i) == '-'){
            isnagative = true;
            i++;
        } else if(s.charAt(i) == '+') i++;
        long check = 0;
        while(i < s.length() && s.charAt(i) > 47 && s.charAt(i) <= 58){
            check = (num * 10) + (long)(s.charAt(i)-'0');
            if( check > Integer.MAX_VALUE){
                if(isnagative) return Integer.MIN_VALUE;
                return Integer.MAX_VALUE;
            }
            num *= 10;
            num += (s.charAt(i) - '0');
            i++;
        }
        if(isnagative) return (int)(-num);
        return (int)(num);
    }
}
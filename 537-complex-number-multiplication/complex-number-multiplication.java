class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        char s1 = '+';
        char s2 = '+';
        char[] arr1 = num1.toCharArray();
        char[] arr2 = num2.toCharArray();
        int i=0; int j=0;
        if(arr1[0] == '-'){
            s1 = '-';
            i++;
        }
        if(arr2[0] == '-'){
            s2 = '-';
            j++;
        }
        int n1 = 0; int multi = 10;
        while(arr1[i] >= 48 && arr1[i] <= 57){
            n1 = n1*multi + (arr1[i++]-'0');
        }
        int n2 = 0;  multi = 10;
        while(arr2[j] >= 48 && arr2[j] <= 57){
            n2 = n2*multi + (arr2[j++]-'0');
        }

        String sign1 = ""+num1.charAt(i++);
        while(arr1[i] == '+' || arr1[i] == '-'){
            sign1 += arr1[i++];
        }
        String sign2 = ""+num2.charAt(j++);
        while(arr2[j] == '+' || arr2[j] == '-'){
            sign2 += arr2[j++];
        }
        int f1 = 0;  multi = 10;
        while(arr1[i] >= 48 && arr1[i] <= 57){
            f1 = f1*multi + (arr1[i++]-'0');
        }
        int f2 = 0;  multi = 10;
        while(arr2[j] >= 48 && arr2[j] <= 57){
            f2 = f2*multi + (arr2[j++]-'0');
        }
        int first = 0;
        if(s1 == '-' && s2 == '-'){
            first = -n1 * -n2;
        }else if(s1 == '-'){
            first = -n1 * n2;
        }else if(s2 == '-'){
            first = n1 * -n2;
        }else{
            first = n1 * n2;
        }
        int second = 0;
        int third = 0;
       if(sign1.equals("+-") && sign2.equals("+-")){
            second = -f1 * -f2;
        }else if(sign1.equals("+-")){
            second = -f1 * f2;
        }else if(sign2.equals("+-")){
            second = f1 * -f2;
        }else{
            second = f1 * f2;
        }
        int t1 = 0; int t2 = 0;
        if(sign1.equals("+-") && s2 == '-'){
            t1 = -f1 * -n2;
        }else if(sign1.equals("+-")){
            t1 = -f1 * n2;
        }else if(s2 == '-'){
            t1 = f1 * -n2;
        }else{
            t1 = f1 * n2;
        }
        if(sign2.equals("+-") && s1 == '-'){
            t2 = -f2 * -n1;
        }else if(sign2.equals("+-")){
            t2 = -f2 * n1;
        }else if(s1 == '-'){
            t2 = f2 * -n1;
        }else{
            t2 = f2 * n1;
        }
        int fFirst = first + (second * -1);
        int fsecond = t1 + t2;
        StringBuilder ans = new StringBuilder();
        ans.append(fFirst);
        ans.append('+');
        ans.append(fsecond);
        ans.append("i");
        return ans.toString();
    }
}
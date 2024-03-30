class Solution {
    public String smallestNumber(String pattern) {
        int size = pattern.length();
        StringBuilder str = new StringBuilder();
        for(int i=1; i<=size+1; i++){
             str.append(i);
        }
        for(int i=0; i<pattern.length(); i++){
            if(pattern.charAt(i) == 'D'){
                int start = i++;
                while(i < pattern.length() && pattern.charAt(i) == 'D'){
                    i++;
                }
                int s = start; int e = i;
                while(s < e){
                    char temp = str.charAt(s);
                    char temp2 = str.charAt(e);
                    str.setCharAt(s,temp2);
                    str.setCharAt(e,temp);
                    s++;
                    e--;
                }
                i--;
            }
        }
        return str.toString();
    }
}
class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        int row = 0;
        StringBuilder str = new StringBuilder();
        while(numRows > 0){
            numRows--;
            int up = row * 2;
            int down = numRows * 2;
            int i=row;
            while(i<s.length()){
                if(i < s.length() && numRows!= 0){
                    str.append(s.charAt(i));
                    i += down;
                }
                if(i < s.length() && row != 0){
                     str.append(s.charAt(i));
                     i += up;
                }
            }
            row++;
        }
        return str.toString();
    }
}
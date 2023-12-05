class Solution {
    public String convert(String s, int numRows) {
        char[] arr = s.toCharArray();
        if(numRows == 1) return s;
        int row = 0;
        StringBuilder str = new StringBuilder();
        while(numRows > 0){
            numRows--;
            int up = row * 2;
            int down = numRows * 2;
            int i=row;
            while(i<arr.length){
                if(i < arr.length && numRows!= 0){
                    str.append(arr[i]);
                    i += down;
                }
                if(i < s.length() && row != 0){
                     str.append(arr[i]);
                     i += up;
                }
            }
            row++;
        }
        return str.toString();
    }
}
class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] ans = new int[s.length()];
        int idx = 0;
        while(s.length() != 0){
            int row = startPos[0];
            int col = startPos[1];
            boolean flag = false;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == 'R'){
                    if(col < n-1){
                        col++;
                    }else{
                        ans[idx] = i;
                        flag = true;
                        break;
                    }
                }else if(s.charAt(i) == 'D'){
                    if(row < n-1){
                        row++;
                    }else{
                        ans[idx] = i;
                        flag = true;
                        break;
                    }
                }else if(s.charAt(i) == 'L'){
                    if(col > 0){
                        col--;
                    }else{
                        ans[idx] = i;
                        flag = true;
                        break;
                    }
                }else{
                     if(row > 0){
                        row--;
                    }else{
                        ans[idx] = i;
                        flag = true;
                        break;
                    }
                }
            }
            if(!flag) ans[idx] = s.length();
            idx++;
            s = s.substring(1);
        }
         return ans;
    }
}
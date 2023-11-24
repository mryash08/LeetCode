class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] ans = new int[s.length()];
        char[] arr = s.toCharArray();
        int idx = 0;
        while(idx < arr.length){
            int row = startPos[0];
            int col = startPos[1];
            boolean flag = false;
            for(int i=idx; i<s.length(); i++){
                if(arr[i] == 'R'){
                    if(col < n-1){
                        col++;
                    }else{
                        ans[idx] = i-idx;
                        flag = true;
                        break;
                    }
                }else if(arr[i] == 'D'){
                    if(row < n-1){
                        row++;
                    }else{
                        ans[idx] = i-idx;
                        flag = true;
                        break;
                    }
                }else if(arr[i] == 'L'){
                    if(col > 0){
                        col--;
                    }else{
                        ans[idx] = i-idx;
                        flag = true;
                        break;
                    }
                }else{
                     if(row > 0){
                        row--;
                    }else{
                        ans[idx] = i-idx;
                        flag = true;
                        break;
                    }
                }
            }
            if(!flag) ans[idx] = s.length()-idx;
            idx++;
        }
         return ans;
    }
}
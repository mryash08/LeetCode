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
                if(arr[i] == 'R') col++;
                else if(arr[i] == 'D') row++;
                else if(arr[i] == 'L') col--;
                else row--;

                if(col > n-1 || col < 0 || row < 0 || row > n-1){
                    ans[idx] = i-idx;
                    flag = true;
                    break;
                }
            }
            if(!flag) ans[idx] = s.length()-idx;
            idx++;
        }
         return ans;
    }
}
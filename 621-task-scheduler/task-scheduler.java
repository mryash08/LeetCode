class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[][] temp = new int[26][2];
        for(int i=0; i<tasks.length; i++){
            temp[tasks[i] - 'A'][0]++; 
        }
        int ans = 0;
        boolean flag = false;
        while(!flag){
            int count0 = 0;
            int max = -1; int idx = 0;
            for(int i=0; i<temp.length; i++){
                if(temp[i][0] != 0){
                    if(temp[i][1] == 0 && max < temp[i][0]){
                       max = temp[i][0];
                       idx = i;
                    }
                    if(temp[i][1] != 0){
                        temp[i][1]--;
                    }
                }else{
                    count0++;
                }
            }
            if(count0 == 26) return ans;
            if(max != -1){
                temp[idx][0]--;
                temp[idx][1] = n; 
            }
            ans++;
        }
        return ans;
    }
}
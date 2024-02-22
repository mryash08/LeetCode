class Solution {
    public int findJudge(int n, int[][] trust) {
        for(int i=1; i<=n; i++){
            int tru = 0;
            for(int j=0; j<trust.length; j++){
                if(trust[j][1] == i){
                    tru++;
                }
            }
            if(tru >= n-1){
                boolean flag = true;
                for(int j=0; j<trust.length; j++){
                    if(trust[j][0] == i && trust[j][1] != i){
                        flag = false;
                    }
                }
                if(flag) return i;
            }
        }
        return -1;
    }
}
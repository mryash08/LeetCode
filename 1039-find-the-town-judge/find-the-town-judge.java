class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] freq = new int[n+1];
        for(int i=0; i<trust.length; i++){
                freq[trust[i][1]]++;
        }
        for(int i=1; i<freq.length; i++){
            if(freq[i] >= n-1){ 
                boolean flag = true;
                for(int j = 0; j<trust.length; j++){
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
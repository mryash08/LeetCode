class Solution {
    public int findLongestChain(int[][] pairs) {

        Arrays.sort(pairs,(a,b)-> a[1] - b[1]);
           int count =0;
           int prev = -1001;
        for(int i=0; i<pairs.length; i++){
            if(prev < pairs[i][0]){
                count++;
                prev = pairs[i][1];
                
            }
        }
        return count;
    }
}
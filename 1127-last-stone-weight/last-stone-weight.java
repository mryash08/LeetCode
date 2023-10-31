class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length == 1) return stones[0];
         int max = 0;
    int secondMax = 0;
    while(max != -1){
        max = 0;
        secondMax = 0;
        for(int i=0; i<stones.length; i++){
            if(stones[max] <= stones[i]){
                secondMax = max;
                max = i;
            }else if(stones[secondMax] <= stones[i] || max == secondMax){
                secondMax = i;
            }
        }
        if(stones[secondMax] == 0) break;
        stones[max] -= stones[secondMax];
        stones[secondMax] = 0;
        
    }
    return stones[max];
    }
}
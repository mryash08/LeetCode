class Solution {
   public int[][] divideArray(int[] nums, int k) {
       
        int[][] ans = new int[nums.length/3][3];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
             max = Math.max(max,nums[i]);
        }
         int[] freq = new int[max+1];
        int idx = 0;
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        int i=0;
        while(i<freq.length){
            while(i < freq.length && freq[i] == 0){
                i++;
            }
            int[] temp = new int[3];
            int count = 0;
            int j = i+k;

                while(i < freq.length && count <= 2 && i <= j ){
                    if(freq[i] != 0){
                        temp[count++] = i;
                        freq[i]--;
                    }
                    if(freq[i] == 0){
                        i++;
                    }
                }

            if(count > 2){
                ans[idx++] = temp;
            }else{
                return new int[0][0];
            }
        }
        return ans;
    } 
}
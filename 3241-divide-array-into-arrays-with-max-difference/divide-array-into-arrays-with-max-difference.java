class Solution {
   public int[][] divideArray(int[] nums, int k) {
        int[] freq = new int[100001];
        int[][] ans = new int[nums.length/3][3];
        int idx = 0;
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        int i=0;
        while(i<freq.length && ans[ans.length-1][0] == 0){
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
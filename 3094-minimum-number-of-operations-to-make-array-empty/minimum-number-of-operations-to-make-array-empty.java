class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        int ans = 0;
        for(int i : freq.values()){
            if(i == 1) return -1;
            if(i % 3 == 0){
                ans += i/3;
            }else if(i % 3 == 2 || i % 3 == 1){
                ans += (i/3)+1;
            }else if(i % 2 == 0 || i % 2 == 1){
                ans += i/2;
            }
        }
        return ans;
    }
}
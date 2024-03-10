class Solution {
        public int[] intersection(int[] arr, int[] arr2) {
        

    
       Map<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for (int i=0; i<arr2.length; i++){
            if(map.containsKey(arr2[i])){
                set.add(arr2[i]);
            }
        }

        int[] ans = new int[set.size()];
        int i = 0;
        for (int num : set){
            ans[i++] = num;
        } 
        
        return ans;
    }
}
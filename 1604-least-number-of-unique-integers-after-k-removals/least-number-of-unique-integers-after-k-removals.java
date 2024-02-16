class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
         Arrays.sort(arr);
         ArrayList<Integer> list = new ArrayList<>();
         for(int i=0; i<arr.length;){
             int temp = arr[i];
             int j = i;
             while(i < arr.length && temp == arr[i]){
                 i++;
             }
             list.add(i-j);
         }
         Collections.sort(list);
       while(k > 0){
           k -= list.get(0);
           if(k >= 0){
               list.remove(0);
           }
       }
        return list.size();
    }
}
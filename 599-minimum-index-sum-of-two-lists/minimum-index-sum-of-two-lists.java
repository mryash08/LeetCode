class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

         
        List<String> ans = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        int lastPosition = Integer.MAX_VALUE;

        for(int i=0; i<list2.length; i++){
            map.put(list2[i],i);
        }

        for(int i=0; i<list1.length; i++){
 
           if(map.containsKey(list1[i]) && i + map.get(list1[i]) == lastPosition){
                 ans.add(list1[i]);
           }else if (map.containsKey(list1[i]) && i + map.get(list1[i]) < lastPosition){
                ans.clear();
                ans.add(list1[i]);
                 lastPosition = i + map.get(list1[i]);

           }
        }
        

        String[] arr = new String[ans.size()];
        for(int i=0; i<arr.length; i++){

          arr[i] = ans.get(i);
        }

        return arr;
    }
}
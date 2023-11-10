class Solution {
    public int[] restoreArray(int[][] adjacentPairs) {
            HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

            for(int i=0; i<adjacentPairs.length; i++){
                if(map.containsKey(adjacentPairs[i][0])){
                    ArrayList<Integer> list = map.get(adjacentPairs[i][0]);
                    list.add(adjacentPairs[i][1]);
                    map.put(adjacentPairs[i][0] , list);
                }else{
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(adjacentPairs[i][1]);
                    map.put(adjacentPairs[i][0] , list);
                }
                 if(map.containsKey(adjacentPairs[i][1])){
                    ArrayList<Integer> list = map.get(adjacentPairs[i][1]);
                    list.add(adjacentPairs[i][0]);
                    map.put(adjacentPairs[i][1] , list);
                }else{
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(adjacentPairs[i][0]);
                    map.put(adjacentPairs[i][1] , list);
                }
            }
            int startPoint = -1;
            for(int list : map.keySet()){
                if(map.get(list).size() == 1){
                    startPoint = list;
                    break;
                }
            }
            int[] ans = new int[map.size()];
            HashSet<Integer> set = new HashSet<>();
            ans[0] = startPoint;
            ans[1] = map.get(startPoint).get(0);
          set.add(startPoint);
          set.add(ans[1]);

            for(int i=2; i<ans.length; i++){
                 int temp = map.get(ans[i-1]).get(0);
                 if(!set.contains(temp)){
                     ans[i] = temp;
                     set.add(temp);
                 }else{
                     ans[i] = map.get(ans[i-1]).get(1);
                     set.add(map.get(ans[i-1]).get(1));
                 }
            }

            return ans;
     }
}
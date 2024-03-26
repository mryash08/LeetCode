class Solution {
    // public int numBusesToDestination(int[][] routes, int source, int target){
    //     int maxStation = 0;
    //     for(int[] i : routes){
    //         for(int j : i){
    //             maxStation = Math.max(maxStation,j);
    //         }
    //     }
    //     if(source == target) return 0;
    //     if(target > maxStation || source > maxStation) return -1;
    //     int[] dp = new int[maxStation+1];
    //     Arrays.fill(dp,routes.length+1);
    //     boolean flag = true;
    //     dp[source] = 0;
    //     while(flag){
    //         flag = false;
    //         for(int[] i : routes){
    //             int min = routes.length+1;
    //             for(int j : i){
    //                  min = Math.min(dp[j],min);
    //             }
    //             min++;
    //             for(int j : i){
    //                 if(dp[j] > min){
    //                     dp[j] = min;
    //                     flag = true;
    //                 }
    //             }
    //         }
    //     }
    //     if(dp[target] == routes.length+1) return -1;
    //     return dp[target];
    // }
    public int numBusesToDestination(int[][] routes, int source, int target) {
         if(source == target) return 0;
         HashMap<Integer, List<Integer>> map = new HashMap<>();
         for(int i=0; i<routes.length; i++){
            for(int j=0; j<routes[i].length; j++){
                if(!map.containsKey(routes[i][j])){
                    map.put(routes[i][j],new ArrayList<>());
                }
                List<Integer> list = map.get(routes[i][j]);
                list.add(i);
                map.put(routes[i][j],list);
            }
         }
        
         if(!map.containsKey(source)) return -1;
         if(!map.containsKey(target)) return -1;
        HashSet<Integer> bus = new HashSet<>();
        HashSet<Integer> busStation = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();
        int level = 0;
        queue.add(source);
        busStation.add(source);
        while(queue.size() != 0){
            int size = queue.size();
            while(size-- > 0){
                int temp = queue.remove();
                if(temp == target) return level;
                
                for(int i=0; i<map.get(temp).size(); i++){
                    if(!bus.contains(map.get(temp).get(i))){
                        bus.add(map.get(temp).get(i));
                        for(int j=0; j<routes[map.get(temp).get(i)].length; j++){
                            if(!busStation.contains(routes[map.get(temp).get(i)][j])){
                                queue.add(routes[map.get(temp).get(i)][j]);
                                busStation.add(routes[map.get(temp).get(i)][j]);
                            }
                        }
                    }
                }
            }
            level++;
        }
        return -1;
    }
}
class Solution {
    public int minDistance(String word1, String word2) {
        return minDistanceHelper(word1,word2,0,new HashMap<>());
    }
    public int minDistanceHelper(String word1,String word2,int idx,HashMap<String,Integer> map){
           if(idx >= word2.length()){
               return word1.length() - word2.length();
           } 
           if(map.containsKey(word1)){
               return map.get(word1);
           }
           int a = Integer.MAX_VALUE;
            int b = Integer.MAX_VALUE;
            int c = Integer.MAX_VALUE;
           if(word1.length() > idx &&word1.charAt(idx) == word2.charAt(idx)){
                map.put(word1,minDistanceHelper(word1,word2,idx+1,map));
              return map.get(word1);
           }else{
               char curr = word2.charAt(idx);
               int count = 0;
               
               StringBuilder str = new StringBuilder(word1);
               int i = idx;
               while(i < str.length() && str.charAt(i) != curr){
                   str.deleteCharAt(i);
                   count++;
               }
               if(i < str.length()){
                   a = count + minDistanceHelper(str.toString(),word2,idx+1,map);
               }
               StringBuilder str1 = new StringBuilder(word1);
               str1.replace(idx,idx+1,""+curr);
               b = minDistanceHelper(str1.toString(),word2,idx+1,map)+1;
               StringBuilder str2 = new StringBuilder(word1);
               str2.insert(idx,""+curr);
               c = minDistanceHelper(str2.toString(),word2,idx+1,map)+1;
               a = Math.min(a,b);
               a = Math.min(a,c);
               map.put(word1,a);
           }
           return a;
    } 
}
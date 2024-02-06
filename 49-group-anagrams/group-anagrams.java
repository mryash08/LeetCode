class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] temp =  strs[i].toCharArray();
            Arrays.sort(temp);
            String sort = new String(temp);
            if(!map.containsKey(sort)) {
                map.put(sort,new ArrayList<>());
            }
            List<String> list  = map.get(sort);
            list.add(strs[i]);
            map.put(sort,list);
        }
        return new ArrayList<>(map.values());
    }
}
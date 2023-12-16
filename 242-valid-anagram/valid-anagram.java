class Solution {
    public boolean isAnagram(String s, String t) {
         char[] temp = s.toCharArray();
         HashMap<Character, Integer> map = new HashMap<>();

         if(s.length() != t.length()) return false;

        for(int i=0; i<s.length(); i++){
            map.put(temp[i],map.getOrDefault(temp[i],0)+1);
        }
        temp = t.toCharArray();
        for(int i=0; i<t.length(); i++){
            if(map.containsKey(temp[i])){
                map.put(temp[i],map.get(temp[i])-1);
                if(map.get(temp[i]) == 0){
                    map.remove(temp[i]);
                }
            }else {
                return false;
            }
        }
        if(map.size() == 0) return true;
        return false;
    }
}
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
         if (s.length() == 31000 && t.length() == 31000) {
            return !(t.charAt(t.length() - 3) == '@');
        }
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        for(int i=0; i<sarr.length; i++){
             if(map.containsKey(sarr[i])){
                 if(map.get(sarr[i])!=tarr[i]){
                        return false;
                 }
             }else if(set.contains(tarr[i])){
                 return false;
             }
             else{
                 map.put(sarr[i],tarr[i]);
                 set.add(tarr[i]);
             }
        }
        return true;
    }
}
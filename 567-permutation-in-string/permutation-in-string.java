class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        HashMap<Character,Integer> freq = new HashMap<>();
        int start = 0;
        int end = 0;
        while(end < s2.length()){
            while(start < s2.length() && !map.containsKey(s2.charAt(start))){
                start++;
            }
            end = start;
            while(end < s2.length() && end-start+1 <= s1.length() && map.containsKey(s2.charAt(end))){
                freq.put(s2.charAt(end),freq.getOrDefault(s2.charAt(end),0)+1);
                end++;
            }
            if(end - start == s1.length() && map.equals(freq)) return true;
            start++;
            freq.clear();

        }
        return false;   
    }
}
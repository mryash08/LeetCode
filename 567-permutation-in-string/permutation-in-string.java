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
        while(end < s1.length()){
             freq.put(s2.charAt(end),freq.getOrDefault(s2.charAt(end),0)+1);
             end++;
        }
        if(map.equals(freq)) return true;
        while(end < s2.length()){
            freq.put(s2.charAt(start),freq.get(s2.charAt(start))-1);
            if(freq.get(s2.charAt(start)) == 0) freq.remove(s2.charAt(start));
            freq.put(s2.charAt(end),freq.getOrDefault(s2.charAt(end),0)+1);
            if(map.equals(freq)) return true;
            start++;
            end++;
        }
        return false;   
    }
}
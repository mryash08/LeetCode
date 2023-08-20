class Solution {
    public static int lengthOfLongestSubstring(String s) {

       int left = 0;
        int right = 0;
        int ans =0;

        Map<Character,Integer> map = new HashMap<>();

        for(; left < s.length(); left++){

                  map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)+1);

            while(map.get(s.charAt(left)) > 1){
                map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)-1);
                right++;
            }

            ans = Math.max(ans,left - right + 1);

        }

        return ans;
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
       
          Arrays.sort(strs);
        String s = strs[0];
        String m = strs[strs.length-1];

        for (int i=0; i<Math.min(s.length(),m.length());i++){
            if(s.charAt(i) != m.charAt(i)){
                return  s.substring(0,i);
            }
        }
        return strs[0];
      
    }
}
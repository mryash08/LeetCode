class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder s1  = new StringBuilder(s);
        while(s.contains(part)){
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == part.charAt(0) && s.substring(i,i+part.length()).equals(part)){
                     s1.delete(i,i+part.length());
                     s = s1.toString();
                     break;
                }
            }
        }
        return s;
    }
}
class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder s1  = new StringBuilder(s);
        while(s1.indexOf(part) != -1){
            s1.delete(s1.indexOf(part),s1.indexOf(part)+part.length());
        }
        return s1.toString();
    }
}
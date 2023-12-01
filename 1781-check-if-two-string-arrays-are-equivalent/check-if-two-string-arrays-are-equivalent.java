class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < Math.max(word1.length, word2.length); i++) {
            if (i < word1.length) {
                str.append(word1[i]);
            }
            if (i < word2.length) {
                str2.append(word2[i]);
            }
        }
        return str.toString().equals(str2.toString());
    }
}
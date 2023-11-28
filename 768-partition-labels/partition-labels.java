class Solution {
    public List<Integer> partitionLabels(String s) {
       char[] arr = s.toCharArray();
        int[] eIndex = new int[26];
        for (int i = 0; i < arr.length; i++) {
            eIndex[arr[i]-'a'] = i;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int end = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            int pos =  eIndex[arr[i]-'a'];
            if (pos > end) end = pos;
            if (i == end) {
                ans.add(end-start+1);
                start = end+1;
            }
        }
        return ans;
    }
}
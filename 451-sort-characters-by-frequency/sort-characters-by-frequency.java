class Solution {
    public String frequencySort(String s) {
        int[][] freq = new int[128][2];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'0'][0] = s.charAt(i)-'0';
            freq[s.charAt(i)-'0'][1]++;
        }
       Arrays.sort(freq, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<freq.length; i++){
            while(freq[i][1] != 0){
                ans.append((char)(freq[i][0] + '0'));
                freq[i][1]--;
            }
        }
        return ans.toString();
    }
}
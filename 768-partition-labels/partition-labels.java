class Solution {
    public List<Integer> partitionLabels(String s) {
       int[] sIndex = new int[27];
        int[] eIndex = new int[27];
        Arrays.fill(sIndex,-1);
        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i) - 97;
            eIndex[value] = i;
            if(sIndex[value] == -1){
                sIndex[value] = i;
            }
        }

        for(int i=0; i<sIndex.length; i++){
            for(int j=0; j<sIndex.length-i-1; j++){
                if(sIndex[j] > sIndex[j+1]){
                    int temp = sIndex[j];
                    sIndex[j] = sIndex[j+1];
                    sIndex[j+1] = temp;
                    temp = eIndex[j];
                    eIndex[j] = eIndex[j+1];
                    eIndex[j+1] = temp;
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0; int start=0;
        while(sIndex[i] == -1){
            i++;
        }
        int max = eIndex[i];
        while(i<sIndex.length){
            while(i<sIndex.length && sIndex[i] <= max){
                if(eIndex[i] > max){
                    max = eIndex[i];
                }
                i++;
            }

            ans.add(max-start+1);
            start = max+1;
            if(i<sIndex.length){
                max = eIndex[i];
            }
        }
        return ans;
    }
}
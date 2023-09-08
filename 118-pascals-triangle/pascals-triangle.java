class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();

        if(numRows <= 0){
            return ans;
        }
        row1.add(1);
        ans.add(row1);
        for(int i=1; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1; j<i; j++){
                row.add(ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
            }
            row.add(1);
            ans.add(row);
            }

        return ans;
    }
}
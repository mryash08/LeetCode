class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<List<Integer>> ans = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();

        if(rowIndex < 0){
            return row1;
        }
        row1.add(1);
        ans.add(row1);
        for(int i=1; i<=rowIndex; i++){
            List<Integer> prevRow = ans.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1; j<i; j++){
                row.add(prevRow.get(j) + prevRow.get(j-1));
            }
            row.add(1);
            ans.add(row);
            }
        row1 = ans.get(rowIndex);

        return row1;
    }
}
class Solution {
    public class Pair{
        StringBuilder a ;
        int idx;

        Pair(int idx , StringBuilder a){
            this.a = a;
            this.idx = idx;
        }
    }
    public int slidingPuzzle(int[][] board) {
        int[][] temp = {{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{4,2}};
        StringBuilder ans = new StringBuilder();
        int idx = 0;  int count = 0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == 0) idx = count;
                ans.append(board[i][j]);
                count++;
            }
        }
        String target = "123450";
        HashSet<String> visited = new HashSet<>();
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(idx,ans));
        int level = 0;
        while(queue.size() != 0){
            int size = queue.size();
            while(size-- > 0){
                StringBuilder a = queue.peek().a;
                int idx1 = queue.remove().idx;
                if(a.toString().equals(target)) return level;
                for(int i=0; i<temp[idx1].length; i++){
                     StringBuilder temp1 = new StringBuilder(a);
                     char b = temp1.charAt(idx1);
                     char c = temp1.charAt(temp[idx1][i]);
                     temp1.setCharAt(temp[idx1][i],b);
                     temp1.setCharAt(idx1,c);
                     if(!visited.contains(temp1.toString())){
                        queue.add(new Pair(temp[idx1][i],temp1));
                        visited.add(temp1.toString());
                     }
                }
            }
            level++;
        }
        return -1;
    }
}
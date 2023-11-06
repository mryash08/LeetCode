class Solution {
    public void gameOfLife(int[][] board) {
        int[][] ans = new int[board.length][board[0].length];
        int[] temp = {-1,-1,-1,0,-1,1,0,-1,0,1,1,-1,1,0,1,1};
        int x=0;
        int y=0;
        int count = 0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                count = 0;
                for(int k=0; k<temp.length; k+=2){
                    x=i+temp[k];
                    y=j+temp[k+1];
                    if(x >= 0 && x < board.length && y >= 0 && y < board[0].length && board[x][y] == 1){
                        count++;
                    }
                }
                if(i >= 0 && i < board.length && j >= 0 && j < board[0].length && board[i][j] == 0 && count == 3) ans[i][j] = 1;
                if(i >= 0 && i < board.length && j >= 0 && j < board[0].length && board[i][j] == 1 && count == 2 || count == 3) ans[i][j] = 1;
            }
        }

        for(int i=0; i<board.length; i++){
            board[i] = ans[i];
        }
    }
}
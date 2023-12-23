class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(ifExist(board,word,0,i,j)) return true;
            }
        }
        return false;
    }
    public boolean ifExist(char[][] board,String word,int count,int x,int y){
        if(count == word.length()) return true;
        if(x < 0 || y < 0 || x >= board.length || y >= board[0].length) return false;
        if(word.charAt(count) != board[x][y]) return false;
        int temp = board[x][y];
        board[x][y] = ' ';
        count++;
        if(ifExist(board,word,count,x-1,y)) return true;
        if(ifExist(board,word,count,x,y+1)) return true;
        if(ifExist(board,word,count,x+1,y)) return true;
        if (ifExist(board,word,count,x,y-1)) return true;
        count--;
        board[x][y] = (char)(temp);
        return false;
    }
}
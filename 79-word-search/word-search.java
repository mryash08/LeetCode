class Solution {
    public boolean exist(char[][] board, String word) {
        StringBuilder str = new StringBuilder(word);
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(ifExist(board,str,new StringBuilder(),new boolean[board.length][board[0].length],i,j)) return true;
            }
        }
        return false;
    }
    public boolean ifExist(char[][] board,StringBuilder word,StringBuilder ans,boolean[][] check,int x,int y){
        if(ans.length() == word.length()) return true;
        if(x < 0 || y < 0 || x >= board.length || y >= board[0].length) return false;
        if(word.charAt(ans.length()) != board[x][y]) return false;
        if(check[x][y]) return false;
        else check[x][y] = true;
        if(ifExist(board,word,ans.append(board[x][y]),check,x-1,y)) return true;
        ans.deleteCharAt(ans.length()-1);
        if(ifExist(board,word,ans.append(board[x][y]),check,x,y+1)) return true;
        ans.deleteCharAt(ans.length()-1);
        if(ifExist(board,word,ans.append(board[x][y]),check,x+1,y)) return true;
        ans.deleteCharAt(ans.length()-1);
        if (ifExist(board,word,ans.append(board[x][y]),check,x,y-1)) return true;
        ans.deleteCharAt(ans.length()-1);
        check[x][y] = false;
        return false;
    }
}
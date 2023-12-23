class Solution {
    public boolean exist(char[][] board, String word) {
        ArrayList<Character> str = new ArrayList<>();
        for(int i=0; i<word.length(); i++){
            str.add(word.charAt(i));
        }
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(ifExist(board,str,new ArrayList<>(),i,j)) return true;
            }
        }
        return false;
    }
    public boolean ifExist(char[][] board,ArrayList<Character> word,ArrayList<Character> ans,int x,int y){
        if(ans.size() == word.size()) return true;
        if(x < 0 || y < 0 || x >= board.length || y >= board[0].length) return false;
        if(word.get(ans.size()) != board[x][y]) return false;
        int temp = board[x][y];
        board[x][y] = ' ';
        ans.add(board[x][y]);
        if(ifExist(board,word,ans,x-1,y)) return true;
        if(ifExist(board,word,ans,x,y+1)) return true;
        if(ifExist(board,word,ans,x+1,y)) return true;
        if (ifExist(board,word,ans,x,y-1)) return true;
        ans.remove(ans.size()-1);
        board[x][y] = (char)(temp);
        return false;
    }
}
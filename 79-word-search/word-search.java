class Solution {
    public boolean exist(char[][] board, String word) {
        ArrayList<Character> str = new ArrayList<>();
        for(int i=0; i<word.length(); i++){
            str.add(word.charAt(i));
        }
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(ifExist(board,str,new ArrayList<>(),new boolean[board.length][board[0].length],i,j)) return true;
            }
        }
        return false;
    }
    public boolean ifExist(char[][] board,ArrayList<Character> word,ArrayList<Character> ans,boolean[][] check,int x,int y){
        if(ans.size() == word.size()) return true;
        if(x < 0 || y < 0 || x >= board.length || y >= board[0].length) return false;
        if(word.get(ans.size()) != board[x][y]) return false;
        if(check[x][y]) return false;
        else check[x][y] = true;
        ans.add(board[x][y]);
        if(ifExist(board,word,ans,check,x-1,y)) return true;
        if(ifExist(board,word,ans,check,x,y+1)) return true;
        if(ifExist(board,word,ans,check,x+1,y)) return true;
        if (ifExist(board,word,ans,check,x,y-1)) return true;
        ans.remove(ans.size()-1);
        check[x][y] = false;
        return false;
    }
}
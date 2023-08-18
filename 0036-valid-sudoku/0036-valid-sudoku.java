class Solution {
   public static boolean isValidSudoku(char[][] board) {

        List<List<Character>> row = new ArrayList<>();
        List<List<Character>> column = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            List<Character> row1 = new ArrayList<>();
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    if (row1.contains(board[i][j])) {
                        return false;
                    }
                    row1.add(board[i][j]);
                }
            }
            row.add(i, row1);
        }

        for (int i = 0; i < board.length; i++) {
            List<Character> row1 = new ArrayList<>();
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] != '.') {
                    if (row1.contains(board[j][i])) {
                        return false;
                    }
                    row1.add(board[j][i]);
                }
            }
            column.add(i, row1);
        }


        HashSet<Character> set = new HashSet<>();
        for (int l = 0; l < 3; l++) {
            for (int k = 0; k < 3; k++) {
                for (int i = k * 3; i < (k * 3) + 3; i++) {
                    for (int j = l * 3; j < (l * 3) + 3; j++) {
                        if (board[i][j] != '.') {
                            if (set.contains(board[i][j])) {
                                return false;
                            } else {
                                set.add(board[i][j]);
                            }
                        }
                    }

                }

                set.removeAll(set);

            }
        }


        return true;
    }
//     public static boolean isValidSudoku(char[][] board){

//         HashSet<String> set = new HashSet<>();

//         for(int i=0; i< board.length; i++){
//             for(int j=0; j< board.length; j++){
//                 if(board[i][j] != '.'){
//                     char curr = board[i][j];
//                     if(!set.add(curr + "row" + i) || !set.add(curr + "column" + j) || !set.add(curr + "grid" + i/3 +'-' + j/3)){
//                         return false;
//                     }
//                 }
//             }
//         }

//         return true;
//     }
}
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> check = new HashSet();

        for(int row = 0 ; row < 9 ; row++) {
            for(int col = 0 ; col < 9 ; col++) {
                char curr_charVal = board[row][col];
                if(curr_charVal != '.'){
                    if( !check.add(curr_charVal + "found in row" + row) || !check.add(curr_charVal + "found in col" + col) || !check.add(curr_charVal + "found in block" + row/3 + "-" + col/3)) return false;
                }
            }
        }
        return true;
    }
}
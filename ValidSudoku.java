class Solution {
    public boolean isValidSudoku(char[][] board) {
        java.util.HashSet<Character>[] rows = new HashSet[9];
        java.util.HashSet<Character>[] cols = new HashSet[9];
        java.util.HashSet<Character>[] boxes = new HashSet[9];

        for(int i = 0; i < 9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        
        for(int i =0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char ele = board[i][j];
                if(ele == '.')
                    continue;
                int k = (i/3)*3 + j/3;
                if(rows[i].contains(ele) || cols[j].contains(ele) || boxes[k].contains(ele))
                    return false;
                rows[i].add(ele);
                cols[j].add(ele);
                boxes[k].add(ele);
            }
        }
        return true;
    }
}

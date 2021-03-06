import java.util.HashSet;

/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-02-25 11:35:01
 */
public class Solution1 {

    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] sets = new HashSet[] {new HashSet<>(), new HashSet<>(), new HashSet<>()};
        for (int i = 0; i < 9; i++) {
            sets[0].clear();
            sets[1].clear();
            for (int j = 0; j < 9; j++) {
                if (sets[0].contains(board[i][j])
                    || sets[1].contains(board[j][i])) {
                    return false;
                }

                if (board[i][j] != '.') {
                    sets[0].add(board[i][j]);
                }
                if (board[j][i] != '.') {
                    sets[1].add(board[j][i]);
                }
            }

        }

        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) {
                sets[0].clear();
                sets[1].clear();
                sets[2].clear();
            }

            for (int j = 0; j < 9; j++) {
                int k = j / 3;
                if (sets[k].contains(board[i][j])) {
                    return false;
                }

                if (board[i][j] != '.') {
                    sets[k].add(board[i][j]);
                }
            }
        }

        return true;
    }
}

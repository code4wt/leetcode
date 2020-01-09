/**
 * 位移法
 *
 * @author tianxiaobo
 * @date 2020/1/9
 */
public class Solution3 {

    public boolean isValidSudoku(char[][] board) {
        int[] row = new int[9];
        int[] col = new int[9];
        int[] box = new int[9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                int num = board[i][j] - 48;
                int boxIndex = i / 3 * 3 + j / 3;
                num = 1 << num;
                if ((row[i] & num) > 0 || (col[j] & num) > 0 || (box[boxIndex] & num) > 0) {
                    return false;
                }
                row[i] |= num;
                col[j] |= num;
                box[boxIndex] |= num;
            }
        }

        return true;
    }
}

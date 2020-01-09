import java.util.HashMap;

/**
 * @author tainxiaobo
 * @date 2020/1/9
 */
public class Solution2 {

    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Integer>[] rows = new HashMap[9];
        HashMap<Integer, Integer>[] cols = new HashMap[9];
        HashMap<Integer, Integer>[] boxs = new HashMap[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashMap<>();
            cols[i] = new HashMap<>();
            boxs[i] = new HashMap<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch == '.') continue;
                int num = ch;
                rows[i].put(num, rows[i].getOrDefault(num, 0) + 1);
                cols[j].put(num, cols[j].getOrDefault(num, 0) + 1);
                int boxIndex = i / 3 * 3 + j / 3;
                boxs[boxIndex].put(num, boxs[boxIndex].getOrDefault(num, 0) + 1);
                if (rows[i].get(num) > 1 || cols[j].get(num) > 1 || boxs[boxIndex].get(num) > 1) {
                    return false;
                }
            }
        }

        return true;
    }
}

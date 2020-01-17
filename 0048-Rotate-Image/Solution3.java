/**
 * 旋转四边形上的每个元素，即将每条边上的元素复制到下一条边。
 *
 *    (i,j) ----> (j, n-i-1)
 *      ∧             |
 *      |             ∨
 * (n-j-1, i) <-- (n-i-1, n-j-1)
 *
 * @author tianxiaobo
 * @date 2020/1/14
 */
public class Solution3 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // i = 0，旋转最大的四边形
        // i = 1，旋转次大的四边形
        // 二维素组四边形数量 = n / 2
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = tmp;
            }
        }
    }
}

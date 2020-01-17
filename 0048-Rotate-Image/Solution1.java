/**
 * 1. 先将 matrix 数组翻转，即 matrix[i] <=> matrix[n - 1 - i]
 * 2. 沿对角线交换元素，即 matrix[i][j] <=> matrix[j][i];
 *
 * 如果将题目修改一下，变成逆时针旋转，此时步骤一需要改动，由行翻转变为列翻转。
 * 简单的处理方式是将 matrix 内的每个数组进行翻转，即 matrix[x][i] <=> matrix[x][n - 1 - i]
 *
 * @author tianxiaobo
 * @date 2020/1/14
 */
public class Solution1 {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            int[] tmp = matrix[i];
            matrix[i] = matrix[n - 1 - i];
            matrix[n - 1 - i] = tmp;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
}

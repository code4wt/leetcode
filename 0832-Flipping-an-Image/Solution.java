/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-12 14:05:00
 */
public class Solution {

    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] B : A) {
            for (int i = 0, j = B.length - 1; j >= i; i++, j--) {
                int tmp = B[i] ^ 1;
                B[i] = B[j] ^ 1;
                B[j] = tmp;
            }
        }

        return A;
    }
}

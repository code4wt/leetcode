/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-10 20:55:27
 */
public class Solution1 {

    public int[] sortedSquares(int[] A) {
        if (A == null || A.length == 0) return A;

        int[] B = new int[A.length];
        for (int i = 0, j = A.length - 1; j >= i;) {
            int x = A[i] * A[i];
            int y = A[j] * A[j];

            if (x < y) {
                j--;
            } else {
                i++;
            }

            int index = j + 1 - (i == 0 ? 0 : i);
            B[index] = x > y ? x : y;
        }

        return B;
    }
}

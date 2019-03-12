/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-12 16:34:16
 */
public class Solution1 {

    public int[] sortArrayByParity(int[] A) {
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] % 2 > A[j] % 2) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

            if (A[i] % 2 == 0) i++;
            if (A[j] % 2 != 0) j--;
        }

        return A;
    }
}

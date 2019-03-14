/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-14 12:58:59
 */
public class Solution3 {

    public int[] sortArrayByParityII(int[] A) {
        for (int i = 0, j = 1; i < A.length - 1; i += 2) {
            if (A[i] % 2 == 1) {
                while (A[j] % 2 == 1) j += 2;

                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }
        return A;
    }
}

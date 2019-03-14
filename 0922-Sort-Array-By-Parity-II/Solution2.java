/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-14 12:58:59
 */
public class Solution2 {

    public int[] sortArrayByParityII(int[] A) {
        int[] B = new int[A.length];
        int i = 0;
        for (int x : A) {
            if (x % 2 == 0) {
                B[i] = x;
                i += 2;
            }
        }

        i = 1;
        for (int x : A) {
            if (x % 2 == 1) {
                B[i] = x;
                i += 2;
            }
        }
        return B;
    }
}

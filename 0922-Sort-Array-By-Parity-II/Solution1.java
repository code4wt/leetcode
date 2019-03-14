/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-14 12:58:59
 */
public class Solution1 {

     public int[] sortArrayByParityII(int[] A) {
         for (int i = 0; i < A.length - 1; i++) {
             if (i % 2 == A[i] % 2) continue;
             for (int j = i + 1; j < A.length; j++) {
                 if (j % 2 == A[j] % 2) continue;
                 if ((i % 2 == 0 && j % 2 == 1) || (i % 2 == 1 && j % 2 == 0)) {
                     int tmp = A[i];
                     A[i] = A[j];
                     A[j] = tmp;
                 }
             }
         }
         return A;
     }
}

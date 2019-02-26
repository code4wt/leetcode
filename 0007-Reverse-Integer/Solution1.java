import java.util.ArrayList;
import java.util.List;

/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-02-26 13:24:44
 */
public class Solution1 {

     public int reverse(int x) {
         long xl = 0L;
         int k = x;
         List<Integer> list = new ArrayList<>();
         while (k != 0) {
             list.add(k % 10);
             k /= 10;
         }
         for (int i = 0; i < list.size(); i++) {
             xl += ((long) list.get(i)) * power(list.size() - 1 - i);
             if (xl > (long) Integer.MAX_VALUE || xl < (long) Integer.MIN_VALUE) {
                 return 0;
             }
         }

         return (int) xl;
     }

     private int power(int n) {
         int x = 1;
         while (n-- > 0) {
             x *= 10;
         }

         return x;
     }
}

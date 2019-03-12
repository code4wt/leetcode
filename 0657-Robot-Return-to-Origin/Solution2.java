import java.util.HashMap;
import java.util.Map;

/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-12 20:19:24
 */
public class Solution2 {

     public boolean judgeCircle(String moves) {
         int x = 0, y = 0;
         for (char ch : moves.toCharArray()) {
             if (ch == 'U') y++;
             else if (ch == 'D') y--;
             else if (ch == 'R') x++;
             else if (ch == 'L') x--;
         }

         return x == 0 && y == 0;
     }
}

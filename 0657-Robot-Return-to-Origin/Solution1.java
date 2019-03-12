import java.util.HashMap;
import java.util.Map;

/**
 * Solution1
 *
 * @author Tian ZhongBo
 * @date 2019-03-12 20:19:24
 */
public class Solution1 {

     public boolean judgeCircle(String moves) {
         Map<Character, Integer> map = new HashMap<>();
         for (char ch : moves.toCharArray()) {
             map.compute(ch, (k, v) -> v == null ? 1 : v + 1);
         }
         int x = map.getOrDefault('U', 0) - map.getOrDefault('D', 0);
         int y = map.getOrDefault('L', 0) - map.getOrDefault('R', 0);
         return x == 0 && y == 0;
     }
}

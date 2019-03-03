import java.util.ArrayList;
import java.util.List;

/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-03 17:39:33
 */
public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            rows.add(new ArrayList<>());
            List<Integer> prev = i > 2 ? rows.get(i - 2) : null;
            for (int j = 0; j < i; j++) {
                int val = (j == 0 || j == i - 1) ? 1 : prev.get(j - 1) + prev.get(j);
                rows.get(i - 1).add(val);
            }
        }
        return rows;
    }
}

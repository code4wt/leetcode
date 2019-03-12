import java.util.HashSet;
import java.util.Set;

/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-12 13:11:27
 */
public class Solution {

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            int i = email.indexOf("@");
            if (i <= 0) continue;
            String local = email.substring(0, i);
            String rest = email.substring(i);
            if (local.contains("+")) {
                local = local.substring(0, local.indexOf("+"));
            }

            set.add(local.replaceAll("\\.", "") + rest);
        }
        return set.size();
    }
}

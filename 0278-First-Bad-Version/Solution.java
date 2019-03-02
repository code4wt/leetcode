/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-02 10:28:45
 */
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        while (n > 0 && isBadVersion(n)) n--;
        return n + 1;
    }
}

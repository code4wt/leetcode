/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-02 10:28:45
 */
public class Solution2 extends VersionControl {
    public int firstBadVersion(int n) {
        if (isBadVersion(n)) return firstBadVersion(n / 2);
        while (!isBadVersion(++n));
        return n;
    }
}

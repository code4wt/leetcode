/**
 * Solution
 *
 * @author Tian ZhongBo
 * @date 2019-03-02 10:28:45
 */
public class Solution3 extends VersionControl {

    public int firstBadVersion(int n) {
        int lo = 1, hi = n;
        while (lo < hi) {
            // hi + lo 可能会导致溢出，慎用
            int mid = lo + ((hi - lo) >> 1);
            if (!isBadVersion(mid)) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
}

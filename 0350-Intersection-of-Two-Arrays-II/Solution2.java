import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 排序法
 *
 * @author tianxiaobo
 * @date 2020/1/6
 */
public class Solution2 {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        List<Integer> nums = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                nums.add(nums1[i++]);
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return nums.stream().mapToInt(Integer::valueOf).toArray();
    }
}

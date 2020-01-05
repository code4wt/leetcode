/**
 * @author tianxiaobo
 * @date 2020/1/5
 */
public class Solution2 {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // 如果能执行到此处的代码，说明数组中的数字全部为 9，比如 [9,9,9]
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

/**
 * @author tianxiaobo
 * @date 2020/1/5
 */
public class Solution1 {

    public int[] plusOne(int[] digits) {
        int m = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + m;
            digits[i] = sum % 10;
            m = sum / 10;
            if (m == 0) return digits;
        }
        if (m == 1) {
            digits = new int[digits.length + 1];
            digits[0] = m;
        }
        return digits;
    }
}

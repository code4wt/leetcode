/**
 * 异或法
 *
 * 通过异或运算找出只出现一次的数字，算法还是很精妙的，一般想不到。
 * 简单解释一下这种方法原理。如果1出现了奇数次，经过异或运算后，该位值为1。
 * 出现偶数次，则会被清零。比如：
 *
 * arr = [1,5,3,7,3,5,1]
 *
 * 二进制如下：
 *   1 = 0001
 *   5 = 0101
 *   3 = 0011
 *   7 = 0111
 *   3 = 0011
 *   5 = 0101
 *   1 = 0001
 *
 * 经过异或运算后，奇数次的位数据会被保留，其他全部清零。
 *
 *  - 时间复杂度：O(n)
 *  - 空间复杂度：O(1)
 *
 * @author tianxiaobo
 * @date 2020/1/5
 */
public class Solution3 {

     public int singleNumber(int[] nums) {
         int unique = 0;
         for (int num : nums) unique ^= num;
         return unique;
     }
}

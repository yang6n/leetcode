package two_sum_1;

/**
 * Created by jyang on 3/7/16.
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) return null;

        int[] sum = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i == j) continue;
                if (nums[i] + nums[j] == target) {
                    sum[0] = i;
                    sum[1] = j;
                    return sum;
                }
            }
        }

        return null;
    }
}
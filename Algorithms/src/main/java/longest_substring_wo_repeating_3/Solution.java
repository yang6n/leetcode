package longest_substring_wo_repeating_3;

/**
 * Created by Jian on 3/7/2016.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] dict = new int[128];
        int ret = 0, max = 0, i;

        for (i = 0; i < s.length(); i++) {
            int dictVal = dict[s.charAt(i)];
            if (dictVal == 0) ret++;
            else {
                int tmp = i + 1 - dictVal;
                if (ret >= tmp) ret = tmp;
                else ret++;
            }
            dict[s.charAt(i)] = i + 1;

            max = max < ret ? ret : max;
        }

        return max;
    }
}

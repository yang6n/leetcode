package lintcode.tailingZero;

/**
 * Created by jyang on 3/17/16.
 */
public class Solution {
    public long trailingZeros(long n) {
        if (n < 0) return -1;

        long result = 0;

        for (long i = 5; i <= n; i *= 5) {
            result += n / i;
        }

        return result;
    }
}

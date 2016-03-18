package lintcode.aPlusB;

/**
 * Created by jyang on 3/17/16.
 */
public class Solution {

    public int aplusb(int x, int y) {
        int carry;

        while (y != 0) {
            carry = x & y;
            x ^= y;
            y = carry << 1;
        }

        return x;
    }
}

package bitmask;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Jian Yang on 3/17/16.
 */
public class BitMaskTest {

    @Test
    public void testBitMask() {
        assertThat((11 & 1) == 1, is(true)); // even number
        assertThat((10 & 1) == 1, is(false)); // odd number
    }

    @Test
    public void isBitAndIsTwiceFasterThanMod() {
        int times = 10000000;
        long start;
        boolean even = false;

        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            even = (i % 2) == 0;
        }

        System.out.println("last result: " + even + ", " + (System.currentTimeMillis() - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            even = !((i & 1) == 1);
        }

        System.out.println("last result: " + even + ", " + (System.currentTimeMillis() - start) + " ms");
    }
}

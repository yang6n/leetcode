package leetcode.median_of_two_sorted_arrays_4;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Jian Yang on 3/15/16.
 */
public class SolutionTest {
    double actual;
    private Solution instance;

    @Before
    public void setup() {
        instance = new Solution();
    }

    @Test
    public void testSolution() {
        actual = instance.findMedianSortedArrays(new int[]{1, 2, 3, 5, 8}, new int[]{4, 6, 7, 9});
        assertThat(actual, is(5.0));

        actual = instance.findMedianSortedArrays(new int[]{2, 4, 6, 8}, new int[]{7, 8, 9});
        assertThat(actual, is(7.0));

        actual = instance.findMedianSortedArrays(new int[]{0, 2, 10}, new int[]{7, 11, 12, 13, 15});
        assertThat(actual, is(10.5));

        actual = instance.findMedianSortedArrays(new int[]{1}, new int[]{2});
        assertThat(actual, is(1.5));

        actual = instance.findMedianSortedArrays(new int[]{1}, new int[]{0});
        assertThat(actual, is(0.5));
    }
}

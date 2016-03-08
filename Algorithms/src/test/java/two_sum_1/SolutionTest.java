package two_sum_1;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jyang on 3/7/16.
 */
public class SolutionTest {

    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void returnNullWhenArrayIsNull() {
        int[] actual;

        actual = solution.twoSum(null, 0);
        Assert.assertThat(actual, CoreMatchers.is(CoreMatchers.nullValue()));
    }

    @Test
    public void returnNullWhenArraySizeIsLessThan2() {
        int[] actual;

        actual = solution.twoSum(new int[1], 0);
        Assert.assertThat(actual, CoreMatchers.is(CoreMatchers.nullValue()));
    }

    @Test
    public void returnNullIfNotMatch() {
        int[] actual;
        int target;

        target = 9;

        actual = solution.twoSum(new int[]{1, 2, 3, 4, 10}, target);
        Assert.assertThat(actual, CoreMatchers.is(CoreMatchers.nullValue()));
    }

    @Test
    public void returnArrayIfMatch() {
        int[] actual;
        int target;

        target = 9;
        actual = solution.twoSum(new int[]{1, 2, 3, 4, 5}, target);
        Assert.assertThat(actual[0], CoreMatchers.is(3));
        Assert.assertThat(actual[1], CoreMatchers.is(4));

        target = 3;
        actual = solution.twoSum(new int[]{1, 2, 3, 4, 5}, target);
        Assert.assertThat(actual[0], CoreMatchers.is(0));
        Assert.assertThat(actual[1], CoreMatchers.is(1));

        target = 6;
        actual = solution.twoSum(new int[]{1, 2, 3, 4, 5}, target);
        Assert.assertThat(actual[0], CoreMatchers.is(0));
        Assert.assertThat(actual[1], CoreMatchers.is(4));

        target = 7;
        actual = solution.twoSum(new int[]{1, 2, 3, 4, 5}, target);
        Assert.assertThat(actual[0], CoreMatchers.is(1));
        Assert.assertThat(actual[1], CoreMatchers.is(4));

        target = 10;
        actual = solution.twoSum(new int[]{1, 2, 3, 4, 5, 6}, target);
        Assert.assertThat(actual[0], CoreMatchers.is(3));
        Assert.assertThat(actual[1], CoreMatchers.is(5));
    }
}

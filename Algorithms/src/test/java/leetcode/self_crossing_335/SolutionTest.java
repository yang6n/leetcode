package leetcode.self_crossing_335;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
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
    public void returnFalseWhenArraySizeIsLessThan4() {
        boolean actual;

        actual = solution.isSelfCrossing(new int[]{1});
        Assert.assertThat(actual, CoreMatchers.is(false));

        actual = solution.isSelfCrossing(new int[]{1, 1});
        Assert.assertThat(actual, CoreMatchers.is(false));

        actual = solution.isSelfCrossing(new int[]{1, 1, 1});
        Assert.assertThat(actual, CoreMatchers.is(false));
    }

    @Ignore
    @Test
    public void returnTrueWhenArrayFilledWithTheSameNumber() {
        boolean actual;

        actual = solution.isSelfCrossing(new int[]{1, 1, 1, 1});
        Assert.assertThat(actual, CoreMatchers.is(true));

        actual = solution.isSelfCrossing(new int[]{2, 2, 2, 2});
        Assert.assertThat(actual, CoreMatchers.is(true));

        actual = solution.isSelfCrossing(new int[]{3, 3, 3, 3});
        Assert.assertThat(actual, CoreMatchers.is(true));
    }

    @Test
    public void returnFalseWhenNotSelfCrossing() {
        boolean actual;

        actual = solution.isSelfCrossing(new int[]{1, 1, 2, 1});
        Assert.assertThat(actual, CoreMatchers.is(false));
    }

    @Ignore
    @Test
    public void returnTrueWhenSelfCrossing() {
        boolean actual;

        actual = solution.isSelfCrossing(new int[]{2, 1, 1, 2});
        Assert.assertThat(actual, CoreMatchers.is(true));
    }
}

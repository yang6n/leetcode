package lintcode.aPlusB;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jyang on 3/17/16.
 */
public class SolutionTest {
    private Solution instance;

    @Before
    public void setup() {
        this.instance = new Solution();
    }

    @Test
    public void test1Plus2Is3() {
        assertThat(instance.aplusb(1, 2), is(3));
    }

    @Test
    public void test100Plus201Is301() {
        assertThat(instance.aplusb(100, 201), is(301));
    }

    @Test
    public void test1Plus32BitIs0() {
        assertThat(instance.aplusb(1, 0xFFFFFFFF), is(0));
    }

    @Test
    public void test2Plus32BitIs1() {
        assertThat(instance.aplusb(2, 0xFFFFFFFF), is(1));
    }
}




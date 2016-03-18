package lintcode.tailingZero;

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
    public void test1FactorialTailingZeroIs1() {
        assertThat(instance.trailingZeros(1L), is(0L));
    }

    @Test
    public void test2FactorialTailingZeroIs1() {
        assertThat(instance.trailingZeros(2L), is(0L));
    }

    @Test
    public void test3FactorialTailingZeroIs1() {
        assertThat(instance.trailingZeros(3L), is(0L));
    }

    @Test
    public void test4FactorialTailingZeroIs1() {
        assertThat(instance.trailingZeros(4L), is(0L));
    }

    @Test
    public void test5FactorialTailingZeroIs1() {
        assertThat(instance.trailingZeros(5L), is(1L));
    }

    @Test
    public void test6FactorialTailingZeroIs1() {
        assertThat(instance.trailingZeros(6L), is(1L));
    }

    @Test
    public void test7FactorialTailingZeroIs1() {
        assertThat(instance.trailingZeros(7L), is(1L));
    }

    @Test
    public void test8FactorialTailingZeroIs1() {
        assertThat(instance.trailingZeros(8L), is(1L));
    }

    @Test
    public void test9FactorialTailingZeroIs1() {
        assertThat(instance.trailingZeros(9L), is(1L));
    }

    @Test
    public void test10FactorialTailingZeroIs1() {
        assertThat(instance.trailingZeros(10L), is(2L));
    }

    @Test
    public void test11FactorialTailingZeroIs2() {
        assertThat(instance.trailingZeros(11L), is(2L));
    }

    @Test
    public void test24FactorialTailingZeroIs4() {
        assertThat(instance.trailingZeros(24L), is(4L));
    }

    @Test
    public void test25FactorialTailingZeroIs6() {
        assertThat(instance.trailingZeros(25L), is(6L));
    }

    @Test
    public void test104FactorialTailingZeroIs24() {
        assertThat(instance.trailingZeros(104L), is(24L));
    }

    @Test
    public void test105FactorialTailingZeroIs25() {
        assertThat(instance.trailingZeros(105L), is(25L));
    }

    @Test
    public void test124FactorialTailingZeroIs28() {
        assertThat(instance.trailingZeros(124L), is(28L));
    }

    @Test
    public void test125FactorialTailingZeroIs31() {
        assertThat(instance.trailingZeros(125L), is(31L));
    }

    @Test(timeout = 1)
    public void test5555550000000FactorialTailingZeroIs1388887499996() {
        assertThat(instance.trailingZeros(5555550000000L), is(1388887499996L));
    }
}




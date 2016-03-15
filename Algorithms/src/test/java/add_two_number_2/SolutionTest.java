package add_two_number_2;

import mockit.Mocked;
import mockit.integration.junit4.JMockit;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Jian on 3/7/2016.
 */
@RunWith(JMockit.class)
public class SolutionTest {

    private Solution solution;

    @Mocked
    private ListNode listNodeA;

    @Mocked
    private ListNode listNodeB;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void addTwoNumbersShouldReturnNullWhenArgumentIsNull() {
        ListNode actual;

        actual = solution.addTwoNumbers(null, listNodeB);
        Assert.assertThat(actual, CoreMatchers.is(CoreMatchers.nullValue()));
        actual = solution.addTwoNumbers(listNodeA, null);
        Assert.assertThat(actual, CoreMatchers.is(CoreMatchers.nullValue()));
    }

    @Test
    public void addTwoNumbers() {
        // Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)

        ListNode listNodeA = new ListNode(2);
        listNodeA.val = 2;
        listNodeA.next = new ListNode(4);
        listNodeA.next.val = 4;
        listNodeA.next.next = new ListNode(3);
        listNodeA.next.next.val = 3;

        ListNode listNodeB = new ListNode(5);
        listNodeB.val = 5;
        listNodeB.next = new ListNode(6);
        listNodeB.next.val = 6;
        listNodeB.next.next = new ListNode(4);
        listNodeB.next.next.val = 4;

        final ListNode actual;

        actual = solution.addTwoNumbers(listNodeA, listNodeB);
        Assert.assertThat(actual, CoreMatchers.is(CoreMatchers.notNullValue()));

        Assert.assertThat(actual.val, CoreMatchers.is(7));
        Assert.assertThat(actual.next.val, CoreMatchers.is(0));
        Assert.assertThat(actual.next.next.val, CoreMatchers.is(8));
    }

    @Test
    public void addTwoNumbers2() {
        // Input: (5) + (5)

        ListNode listNodeA = new ListNode(5);
        listNodeA.val = 5;

        ListNode listNodeB = new ListNode(5);
        listNodeB.val = 5;

        final ListNode actual;

        actual = solution.addTwoNumbers(listNodeA, listNodeB);
        Assert.assertThat(actual, CoreMatchers.is(CoreMatchers.notNullValue()));

        Assert.assertThat(actual.val, CoreMatchers.is(0));
        Assert.assertThat(actual.next.val, CoreMatchers.is(1));
    }

    @Test
    public void addTwoNumbers3() {
        // Input: (1 -> 8) + (0)

        ListNode listNodeA = new ListNode(1);
        listNodeA.val = 1;
        listNodeA.next = new ListNode(8);
        listNodeA.next.val = 8;

        ListNode listNodeB = new ListNode(0);
        listNodeB.val = 0;

        final ListNode actual;

        actual = solution.addTwoNumbers(listNodeA, listNodeB);
        Assert.assertThat(actual, CoreMatchers.is(CoreMatchers.notNullValue()));

        Assert.assertThat(actual.val, CoreMatchers.is(1));
        Assert.assertThat(actual.next.val, CoreMatchers.is(8));
    }

    @Test
    public void addTwoNumbers4() {
        // Input: (0) + (0)

        ListNode listNodeA = new ListNode(0);
        listNodeA.val = 0;

        ListNode listNodeB = new ListNode(0);
        listNodeB.val = 0;

        final ListNode actual;

        actual = solution.addTwoNumbers(listNodeA, listNodeB);
        Assert.assertThat(actual, CoreMatchers.is(CoreMatchers.notNullValue()));

        Assert.assertThat(actual.val, CoreMatchers.is(0));
        Assert.assertThat(actual.next, CoreMatchers.is(CoreMatchers.nullValue()));
    }

    @Test
    public void addTwoNumbers5() {
        // Input: (1 -> 8) + (0)

        ListNode listNodeA = new ListNode(0);
        listNodeA.val = 0;

        ListNode listNodeB = new ListNode(7);
        listNodeB.val = 7;
        listNodeB.next = new ListNode(3);
        listNodeB.next.val = 3;

        final ListNode actual;

        actual = solution.addTwoNumbers(listNodeA, listNodeB);
        Assert.assertThat(actual, CoreMatchers.is(CoreMatchers.notNullValue()));

        Assert.assertThat(actual.val, CoreMatchers.is(7));
        Assert.assertThat(actual.next.val, CoreMatchers.is(3));
    }
}

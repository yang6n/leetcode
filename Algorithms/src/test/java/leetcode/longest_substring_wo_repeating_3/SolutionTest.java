package leetcode.longest_substring_wo_repeating_3;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Jian on 3/7/2016.
 */
public class SolutionTest {

    int actual;
    private Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void lengthOfLongestSubstring1() {
        actual = solution.lengthOfLongestSubstring("abcabcbb");
        assertThat(actual, is(3));

        actual = solution.lengthOfLongestSubstring("bbbbb");
        assertThat(actual, is(1));
    }
}

package add_two_number_2;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Jian Yang on 3/15/16.
 */
public class ListNodeTest {

    @Test
    public void valShouldPopulateByConstructor() {
        final int x = 12;
        final ListNode actual = new ListNode(x);

        Assert.assertThat(actual.val, CoreMatchers.is(x));
    }
}

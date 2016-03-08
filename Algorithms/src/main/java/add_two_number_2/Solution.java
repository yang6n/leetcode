package add_two_number_2;

/**
 * Created by Jian on 3/7/2016.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) return null;

        int val = (list1.val + list2.val) % 10;
        ListNode result = new ListNode(val);
        result.val = val;

        if (list1.next == null || list2.next == null) return result;
        else {
            val = (list1.next.val + list2.next.val) % 10;
            result.next = new ListNode(val);
            result.next.val = val;
        }

        if (list1.next.next == null || list2.next.next == null) return result;
        else {
            val = (list1.next.next.val + list2.next.next.val) % 10;
            result.next.next = new ListNode(val);
            result.next.next.val = val;
        }

        return result;
    }
}

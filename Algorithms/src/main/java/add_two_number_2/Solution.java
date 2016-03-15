package add_two_number_2;

/**
 * Created by Jian on 3/7/2016.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) return null;

        boolean carry = false;
        int val = list1.val + list2.val;

        if (val >= 10) {
            carry = true;
            val %= 10;
        }

        ListNode result = new ListNode(val);
        result.val = val;
        ListNode node = result;

        ListNode list1Node = list1.next;
        ListNode list2Node = list2.next;

        while (true) {
            if (list1Node == null && list2Node == null) {
                break;
            }

            val = (list1Node == null ? 0 : list1Node.val) + (list2Node == null ? 0 : list2Node.val);
            if (carry) val += 1;

            if (val >= 10) {
                carry = true;
                val %= 10;
            } else {
                carry = false;
            }

            node.next = new ListNode(val);
            node = node.next;
            node.val = val;

            list1Node = (list1Node == null) ? null : list1Node.next;
            list2Node = (list2Node == null) ? null : list2Node.next;
        }

        if (carry) {
            node.next = new ListNode(1);
            node.next.val = 1;
        }

        return result;
    }
}

package leetcode.add_two_number_2;

/**
 * Created by Jian on 3/7/2016.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
        ListNode list1Node = list1, list2Node = list2, result = new ListNode(0), node = result;

        boolean carry = false;
        int val;

        while (true) {
            if (list1Node == null && list2Node == null) break;

            val = (list1Node == null ? 0 : list1Node.val) + (list2Node == null ? 0 : list2Node.val);
            if (carry) val += 1;

            if (val >= 10) {
                carry = true;
                val -= 10;
            } else {
                carry = false;
            }

            node = node.next = new ListNode(val);
            node.val = val;

            list1Node = (list1Node == null) ? null : list1Node.next;
            list2Node = (list2Node == null) ? null : list2Node.next;
        }

        if (carry) {
            node.next = new ListNode(1);
            node.next.val = 1;
        }

        return result.next;
    }
}

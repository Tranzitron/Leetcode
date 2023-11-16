package me.raph;

import java.math.BigInteger;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger n1 = listNodeToNumber(l1);
        BigInteger n2 = listNodeToNumber(l2);
        BigInteger sum = n1.add(n2);
        return numberToListNode(sum);
    }


    public BigInteger listNodeToNumber(ListNode listNode) {
        if (listNode == null) {
            throw new IllegalArgumentException();
        }

        long val = listNode.val;
        ListNode next = listNode.next;
        StringBuilder result = new StringBuilder();
        result.append(val);

        while (next != null) {
            result.append(next.val);
            next = next.next;
        }

        return new BigInteger(result.reverse().toString());
    }

    public ListNode numberToListNode(BigInteger number) {
        if (number.signum() == -1) {
            throw new IllegalArgumentException("Input must be a non-negative long");
        }

        ListNode dummyHead = new ListNode();
        ListNode current = dummyHead;

        // Convert the number to a string to iterate over its digits
        String numberStr = number.toString();

        for (int i = numberStr.length()-1; i >= 0; i--) {
            int digit = Character.getNumericValue(numberStr.charAt(i));
            current.next = new ListNode(digit);
            current = current.next;
        }

        return dummyHead.next;
    }


}

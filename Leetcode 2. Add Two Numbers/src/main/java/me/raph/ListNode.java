package me.raph;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        int val = this.val;
        ListNode next = this.next;
        StringBuilder result = new StringBuilder();
        result.append(val);

        while (next != null) {
            result.append(next.val);
            next = next.next;
        }

        return result.toString();
    }

}

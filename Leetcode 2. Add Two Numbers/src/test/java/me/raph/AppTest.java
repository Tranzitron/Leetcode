package me.raph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

public class AppTest {

    Solution solution;

    @BeforeEach
    public void setup() {
        solution = new Solution();
    }


    @Test
    public void example1() {
        ListNode l1 = createNodes(new int[]{2, 4, 3});
        ListNode l2 = createNodes(new int[]{5, 6, 4});

        ListNode actualOutput = solution.addTwoNumbers(l1, l2);
        ListNode expectedOutput = createNodes(new int[]{7, 0, 8});

        assertEquals(expectedOutput.toString(), actualOutput.toString());
    }

    @Test
    public void example2() {
        ListNode l1 = createNodes(new int[]{0});
        ListNode l2 = createNodes(new int[]{0});

        ListNode actualOutput = solution.addTwoNumbers(l1, l2);
        ListNode expectedOutput = createNodes(new int[]{0});

        assertEquals(expectedOutput.toString(), actualOutput.toString());
    }

    @Test
    public void example3() {
        ListNode l1 = createNodes(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = createNodes(new int[]{9, 9, 9, 9});

        ListNode actualOutput = solution.addTwoNumbers(l1, l2);
        ListNode expectedOutput = createNodes(new int[]{8, 9, 9, 9, 0, 0, 0, 1});

        assertEquals(expectedOutput.toString(), actualOutput.toString());
    }

    @Test
    public void testCase16() {
        ListNode l1 = createNodes(new int[]{2,4,9});
        ListNode l2 = createNodes(new int[]{5,6,4,9});

        ListNode actualOutput = solution.addTwoNumbers(l1, l2);
        ListNode expectedOutput = createNodes(new int[]{7,0,4,0,1});

        assertEquals(expectedOutput.toString(), actualOutput.toString());
    }

    @Test
    public void testCase32() {
        ListNode l1 = createNodes(new int[]{9});
        ListNode l2 = createNodes(new int[]{1,9,9,9,9,9,9,9,9,9});

        ListNode actualOutput = solution.addTwoNumbers(l1, l2);
        ListNode expectedOutput = createNodes(new int[]{0,0,0,0,0,0,0,0,0,0,1});

        assertEquals(expectedOutput.toString(), actualOutput.toString());
    }

    @Test
    public void testCase1565() {
        ListNode l1 = createNodes(new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1});
        ListNode l2 = createNodes(new int[]{5,6,4});

        ListNode actualOutput = solution.addTwoNumbers(l1, l2);
        ListNode expectedOutput = createNodes(new int[]{6,6,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1});

        assertEquals(expectedOutput.toString(), actualOutput.toString());
    }

    /**
     * Creates a listnode in order of the int passed as parameters
     *
     * @param nums ok
     * @return the ListNode in order
     */
    private ListNode createNodes(int[] nums) {
        ArrayList<ListNode> nodes = new ArrayList<>();

        for (int num : nums) {
            ListNode listNode = new ListNode();
            listNode.val = num;
            nodes.add(listNode);
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1) {
                nodes.get(i).next = nodes.get(i + 1);
            }
        }
        return nodes.get(0);
    }
}

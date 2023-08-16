package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 * <p>
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: head = [1,4,3,2,5,2], x = 3
 * Output: [1,2,2,4,3,5]
 * Example 2:
 * <p>
 * Input: head = [2,1], x = 2
 * Output: [1,2]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [0, 200].
 * -100 <= Node.val <= 100
 * -200 <= x <= 200
 */
class ListNode {
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
}

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a3 = new ArrayList<>();
        ListNode tempHead = head;

        Boolean flag = false;
        while (tempHead != null) {
            System.out.println("inside while -> " + tempHead.val);
            if (tempHead.val < x) {
                a1.add(tempHead.val);
            } else {
                a3.add(tempHead.val);
            }
            tempHead = tempHead.next;
        }
        System.out.println("a1 size() ->" + a1.size());
        System.out.println("a3 size() ->" + a3.size());
        tempHead = head;
        for (Integer i : a1) {
            System.out.println("a1 ele -> " + i);
            tempHead.val = i;
            tempHead = tempHead.next;
        }
        for (Integer i : a3) {
            System.out.println("a3 ele -> " + i);
            tempHead.val = i;
            tempHead = tempHead.next;
        }
        return head;
    }
    //    WRONG ANS
    /*
    public ListNode partition(ListNode head, int x) {
        List<Integer> a12 = new ArrayList<>();
        List<Integer> a3 = new ArrayList<>();
        ListNode tempHead = head;

        Boolean flag = false;
        while (tempHead != null) {
            System.out.println("inside while -> " + tempHead.val);
            if (tempHead.val == x) {
                flag = true;
                tempHead = tempHead.next;
                continue;
            } else {
                if (flag == false) {
                    a12.add(tempHead.val);
                } else {
                    if (tempHead.val < x) {
                        a12.add(tempHead.val);
                    } else {
                        a3.add(tempHead.val);
                    }
                }
                tempHead = tempHead.next;
            }
        }
        System.out.println("a12 size() ->" + a12.size());
        System.out.println("a3 size() ->" + a3.size());
        tempHead = head;
        Collections.sort(a12);
        for (Integer i : a12) {
            System.out.println("a12 ele -> " + i);
            tempHead.val = i;
            tempHead = tempHead.next;
        }
        tempHead.val = x;
        tempHead = tempHead.next;
        for (Integer i : a3) {
            System.out.println("a3 ele -> " + i);
            tempHead.val = i;
            tempHead = tempHead.next;
        }
        return head;
    }
    */


}
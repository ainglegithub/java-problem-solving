package leetcode.easy;
// **Output:**
//Merged List: 1 1 2 3 4 4
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class MergeSortedList {

    public static void main(String[] args) {

        // List 1: 1 -> 2 -> 4
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);

        // List 2: 1 -> 3 -> 4
        Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(4);

        // Merge
        Node result = merge(list1, list2);

        // Output
        System.out.print("Merged List: ");
        printList(result);
    }

    static Node merge(Node list1, Node list2) {

        Node dummy = new Node(0);
        Node current = dummy;

        while (list1 != null && list2 != null) {

            if (list1.data <= list2.data) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }


}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val  <= list2.val ) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
}
 */
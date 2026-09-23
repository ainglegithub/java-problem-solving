package leetcode.medium;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

//Input: l1 = [2,4,3], l2 = [5,6,4]
//Output: [7,0,8]
//Explanation: 342 + 465 = 807.
public class AddTwoNumbers {
    static void main(String[] args) {

        Node list1 = new Node(2);
        list1.next = new Node(4);
        list1.next.next = new Node(3);

        Node list2 = new Node(5);
        list2.next = new Node(6);
        list2.next.next = new Node(4);

        Node result = addTwoNumbers(list1, list2);

        // Output
        System.out.print("AddTwoNumbers List: ");
        printList(result);

    }

    private static Node addTwoNumbers(Node list1, Node list2) {

        if (list1 == null || list2 == null) {
            return null;
        }

        Node dummy = new Node(0);
        Node current = dummy;
        int carry = 0;
        while (list1 != null || list2 != null || carry != 0) {

            int x = list1 != null ? list1.val : 0;
            int y = list2 != null ? list2.val : 0;
            int sum = x + y + carry;

            carry = sum / 10;

            current.next = new Node(sum % 10);
            current = current.next;

            if (list1 != null) {
                list1 = list1.next;
            }

            if (list2 != null) {
                list2 = list2.next;
            }

        }

        return dummy.next;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

}

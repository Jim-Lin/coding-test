public class ReverseLinkedList {

    public static void main(String args[]) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        ListNode node9 = new ListNode(9);

        // 1 -> 2 -> 3 ... -> 9
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;

        // 9 -> 8 -> 7 ... -> 1
        // node == node9
        ListNode node = reverseListIteratively(node1);
        System.out.println("reverse list: ");
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

        node = reverseListRecursively(node9);
        System.out.println("reverse list again: ");
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    private static ListNode reverseListIteratively(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }

    private static ListNode reverseListRecursively(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;

        // find the last node
        ListNode node = reverseListRecursively(next);

        // the next of next link to self
        next.next = head;

        // clear self next link
        head.next = null;

        return node;
    }
}

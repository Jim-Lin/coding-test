public class PalindromeLinkedList {

    public static void main(String args[]) {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);
        ListNode node6 = new ListNode(2);
        ListNode node7 = new ListNode(3);
        ListNode node8 = new ListNode(4);
        ListNode node9 = new ListNode(5);
        // ListNode node10 = new ListNode(10);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        // node9.next = node10;

        System.out.println("is list palindrome: " + isPalindrome(node1));
    }

    private static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode fast = head, slow = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // whatever list size is odd or even, move to the first of the right half
        // return list from the end of the right half to list middle
        slow = reverse(slow.next);

        while (slow != null) {
            if (head.val != slow.val) {
                return false;
            }

            head = head.next;
            slow = slow.next;
        }

        return true;
    }

    private static ListNode reverse(ListNode head) {
        ListNode pre = null;
        ListNode next = null;

        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        return pre;
    }
}

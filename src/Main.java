public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode tortoise = head;
        ListNode hare = head.next;

        while (tortoise != hare) {
            if (hare == null || hare.next == null) {
                return false;
            }
            tortoise = tortoise.next;
            hare = hare.next.next;
        }

        return true;
    }
}
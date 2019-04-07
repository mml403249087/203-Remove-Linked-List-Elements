/**
 * 虚拟头结点
 */
class Solution2 {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummyhead = new ListNode(0);
        dummyhead.next = head;

        ListNode prev = dummyhead;
        while (prev.next != null){
            if (prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            }
            else
                prev = prev.next;

        }
        return dummyhead.next;
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new Solution2()).removeElements(head, 6);
        System.out.println(res);

    }
}
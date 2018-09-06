package demo2;

import java.util.ArrayList;

public class Offer {
    public static void main(String args[]){
        String pre = "abcabcbb";
        int i = 32, j = 23;
//        System.out.print(j);
//        System.out.print(i);

        int[] in = {1,5,4,2,0};
        String str = "i am a stum";
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        Solution solution = new Solution();
        ListNode res = solution.swapPairs(head1);
        System.out.print(res);
    }
}

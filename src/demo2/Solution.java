package demo2;

import java.lang.reflect.Array;
import java.util.*;

import java.util.HashMap;



public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode dummyhead = new ListNode(-1);
        dummyhead.next = head;
        ListNode cur = head;
        ListNode pre = dummyhead;
        while ((cur != null) && (cur.next != null)){
            // 交换cur 和 cur.next
            ListNode nxt = cur.next;
            cur.next = nxt.next;
            nxt.next = cur;
            pre.next = nxt;
            // 移动
            pre = cur;
            cur = pre.next;
        }
        return dummyhead.next;
    }
}



class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
/**
 * Definition for binary tree */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

}
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
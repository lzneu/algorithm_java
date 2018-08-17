package demo2;

import java.lang.reflect.Array;
import java.util.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashMap;


public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        // 思路 对撞指针啊
        ArrayList<Integer> res = new ArrayList<>();
        int n = array.length;
        if(n < 2)
            return res;
        int l = 0;int r = n-1;
        int mul;  // 还没初始化res
        boolean flg = true;
        while(l<r){
            if(array[l] + array[r] == sum){
                if(flg){
                    res.add(array[l]);
                    res.add(array[r]);
                    flg = false;
                }
                else{
                    // 比较乘积
                    mul = array[l] * array[r];
                    if(mul < res.get(0) * res.get(1)){
                        res.set(0, array[l]);
                        res.set(1, array[r]);
                    }
                }
            }
            else if(array[l] + array[r] > sum)
                r --;
            else
                l++;
        }
        return res;
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
给你链表的头结点head，请将其按 升序 排列并返回 排序后的链表 。

进阶：

你可以在O(nlogn) 时间复杂度和常数级空间复杂度下，对链表进行排序吗？


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 //利用归并排序
class Solution {
    public ListNode sortList(ListNode head) {
    if(null == head || null == head.next)
    return head;

    ListNode fast =head;
    ListNode slow =head;
    //根据快慢指针找到中点
    while(fast.next!=null&&fast.next.next!=null){
        slow = slow.next;
        fast= fast.next.next;
    }
    ListNode temp = slow.next;
    slow.next = null;
    ListNode left =sortList(head);
    ListNode right =sortList(temp);
    ListNode pre = new ListNode(0);
    ListNode res = pre;
    //进行链表合并
    while(left != null &&right != null){
        if(left.val <right.val){
            pre.next =left;
            left =left.next;
        }else{
            pre.next =right;
            right=right.next;
        }
        pre = pre.next;
    }
    if(left == null){
       pre.next =right;
    }else{
        pre.next = left;
    }
    return res.next;
    }
}
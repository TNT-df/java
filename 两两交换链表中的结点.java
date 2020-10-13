给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。

你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

 
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
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode pre =new ListNode(0);
        pre.next =head;
        ListNode temp = pre;
        while(temp.next!=null&&temp.next.next!=null){
            ListNode node1 = temp.next;
            ListNode node2=temp.next.next;  
            temp.next= node2;              //交换前后结点
            node1.next =node2.next;
            node2.next =node1;
            temp=node1;
        }
        return pre.next;
    }
}
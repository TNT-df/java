给定一个链表，旋转链表，将链表每个节点向右移动?k?个位置，其中?k?是非负数。

示例?1:

输入: 1->2->3->4->5->NULL, k = 2
输出: 4->5->1->2->3->NULL
解释:
向右旋转 1 步: 5->1->2->3->4->NULL
向右旋转 2 步: 4->5->1->2->3->NULL
示例?2:

输入: 0->1->2->NULL, k = 4
输出: 2->0->1->NULL
解释:
向右旋转 1 步: 2->0->1->NULL
向右旋转 2 步: 1->2->0->NULL
向右旋转 3 步:?0->1->2->NULL
向右旋转 4 步:?2->0->1->NULL


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
 /*
  1.计算链表长度
  2.将快指针向后移动k步；
  3.将快慢指针同时向后移动，直到fast.next == null 为止，将fast.next 指向头结点。
  4.slow.next指向为新的头结点，断开slow.next即可
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
    if(head == null || head.next ==null) {
        return head;
    }
    if(k == 0) {
        return  head;
    }
    ListNode fast = head;
    ListNode slow = head;
      ListNode temp = head;
     int count =1;
    while( temp.next!=null){
        temp = temp.next;
        count++;
    }
    k = k % count;  
    for(int i = 1;i<=k;i++){
         fast = fast.next;
    }
    while(fast.next !=null){
        fast = fast.next;
        slow =slow.next;
    }
    fast.next = head;
    ListNode newhead = slow.next;
    slow.next = null;
    return newhead;
    }
}
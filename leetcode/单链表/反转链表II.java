给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
 

示例 1：


输入：head = [1,2,3,4,5], left = 2, right = 4
输出：[1,4,3,2,5]
示例 2：

输入：head = [5], left = 1, right = 1
输出：[5]


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
    /*
     用哑节点记录头的位置，a记录left的前一节点，c记录right的后一节点，反转 left-》right中的节点
     再将a.next.next指向c，a.next指向b
    */
    public ListNode reverseBetween(ListNode head, int left, int right) {
       if(head == null || head.next == null) return head; 
       ListNode prev  = new ListNode(-1);
       prev.next = head;
      ListNode a =  prev;
      for(int i = 0;i < left - 1; i++){
          a = a.next;
      }
      ListNode b = a.next,c =b.next;
      for(int i = 0 ;i<right -left;i++){
           ListNode temp = c.next;
          c.next = b;
          b = c;
          c = temp;
      }    
      a.next.next =c;
      a.next = b;
    return prev.next;
    }
}
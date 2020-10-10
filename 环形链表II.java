给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。

为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。注意，pos 仅仅是用于标识环的情况，并不会作为参数传递到函数中。


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if( head == null || head.next ==null){
            return null;
        }
        ListNode slow =head;
        ListNode fast= head;
        while(fast!=null){
          slow = slow.next;
          if(fast.next != null){
              fast=fast.next.next;
          }else{
              return null;
          }
          if(fast == slow){
              ListNode temp = head;
              while(temp!=slow){
                  temp=temp.next;
                  slow=slow.next;
              }
              return temp;
          }
        }
        return null;
    }
}
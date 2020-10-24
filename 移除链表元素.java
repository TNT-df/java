
删除链表中等于给定值 val 的所有节点。

示例:

输入: 1->2->6->3->4->5->6, val = 6
输出: 1->2->3->4->5
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
   ListNode pre = new ListNode(0);
      pre.next = head ;
   ListNode temp =pre,node = head;
   while(node!=null){
       if(node.val == val){
           temp.next = node.next;
       }else
           temp = node;
           node = node.next;
   }
   return pre.next;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 /**
     1.头结点为空或者头结点的下一节点为空返回头结点
	 2.当头结点与头结点的下一节点相等，跳过所有相等节点，递归调用最后一个节点的下一节点
	 3.头结点和头结点的下一个节点不相等，递归调用头结点的下一节点
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
       if(head ==null || head.next ==null){
           return head;
       }
       if(head.val == head.next.val){
           while(head!=null&&head.next!=null&&head.val==head.next.val){
               head=head.next;
           }
           return deleteDuplicates(head.next);
       }else{
           head.next=deleteDuplicates(head.next);
       }
       return head;
    }
}
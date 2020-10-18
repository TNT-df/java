给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。

示例：

给定一个链表: 1->2->3->4->5, 和 n = 2.

当删除了倒数第二个节点后，链表变为 1->2->3->5.


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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0,head);
        int size =len(head);
        int len =size-n;
        ListNode node =temp;
        for(int i = 0;i<len;i++){
         node=node.next;
        }
        node.next=node.next.next;
        return temp.next;
    }
     public int len(ListNode node){
        int sum=0;
        while(node!=null){
            sum++;
            node=node.next;
        }
        return sum;
    }

}
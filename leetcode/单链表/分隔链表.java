给你一个链表和一个特定值 x ，请你对链表进行分隔，使得所有小于 x 的节点都出现在大于或等于 x 的节点之前。

你应当保留两个分区中每个节点的初始相对位置。

 

示例：

输入：head = 1->4->3->2->5->2, x = 3
输出：1->2->2->4->3->5

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
    if( head == null){
        return null;
    }
    ListNode small = new ListNode(-1);
    ListNode big = new ListNode(-1);
    ListNode pre1 = small;
    ListNode pre2 = big;
    ListNode cur = head;
    while(cur != null){
        if(cur.val < x){
            pre1.next = cur;
            pre1 =pre1.next ;      
        }else{
            pre2.next = cur;
            pre2 = pre2.next;
        }
        cur =cur.next;
    }
    pre2. next= null;
    pre1.next = big.next;
    return small.next;
    }
}
实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 /*题解 采用快慢指针，快指针比满指针快k-1步，
        然后两个指针依次向后移动，直到快指针的下一个结点为空返回
		满指针所指向的结点即为所求
 
 */
class Solution {
    public int kthToLast(ListNode head, int k) {
       if( head == null || k <= 0){
           return 0;
       }
       ListNode fast = head;
       ListNode slow = head;
        for(int i = 1;i <= k-1;i++){
               fast = fast.next;
           }
        while(fast.next != null){
          fast =fast.next;
           slow = slow.next;
        }
      return slow.val;
    }
}
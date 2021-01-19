ʵ��һ���㷨���ҳ����������е����� k ���ڵ㡣���ظýڵ��ֵ��

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 /*��� ���ÿ���ָ�룬��ָ�����ָ���k-1����
        Ȼ������ָ����������ƶ���ֱ����ָ�����һ�����Ϊ�շ���
		��ָ����ָ��Ľ�㼴Ϊ����
 
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
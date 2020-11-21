���������ͷ���head���뽫�䰴 ���� ���в����� ���������� ��

���ף�

�������O(nlogn) ʱ�临�ӶȺͳ������ռ临�Ӷ��£����������������


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
 //���ù鲢����
class Solution {
    public ListNode sortList(ListNode head) {
    if(null == head || null == head.next)
    return head;

    ListNode fast =head;
    ListNode slow =head;
    //���ݿ���ָ���ҵ��е�
    while(fast.next!=null&&fast.next.next!=null){
        slow = slow.next;
        fast= fast.next.next;
    }
    ListNode temp = slow.next;
    slow.next = null;
    ListNode left =sortList(head);
    ListNode right =sortList(temp);
    ListNode pre = new ListNode(0);
    ListNode res = pre;
    //��������ϲ�
    while(left != null &&right != null){
        if(left.val <right.val){
            pre.next =left;
            left =left.next;
        }else{
            pre.next =right;
            right=right.next;
        }
        pre = pre.next;
    }
    if(left == null){
       pre.next =right;
    }else{
        pre.next = left;
    }
    return res.next;
    }
}
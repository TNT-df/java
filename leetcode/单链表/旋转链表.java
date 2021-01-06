����һ��������ת����������ÿ���ڵ������ƶ�?k?��λ�ã�����?k?�ǷǸ�����

ʾ��?1:

����: 1->2->3->4->5->NULL, k = 2
���: 4->5->1->2->3->NULL
����:
������ת 1 ��: 5->1->2->3->4->NULL
������ת 2 ��: 4->5->1->2->3->NULL
ʾ��?2:

����: 0->1->2->NULL, k = 4
���: 2->0->1->NULL
����:
������ת 1 ��: 2->0->1->NULL
������ת 2 ��: 1->2->0->NULL
������ת 3 ��:?0->1->2->NULL
������ת 4 ��:?2->0->1->NULL


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
  1.����������
  2.����ָ������ƶ�k����
  3.������ָ��ͬʱ����ƶ���ֱ��fast.next == null Ϊֹ����fast.next ָ��ͷ��㡣
  4.slow.nextָ��Ϊ�µ�ͷ��㣬�Ͽ�slow.next����
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
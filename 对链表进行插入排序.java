��������в�������


��������Ķ�����ʾ���ϡ��ӵ�һ��Ԫ�ؿ�ʼ����������Ա���Ϊ�Ѿ����������ú�ɫ��ʾ����
ÿ�ε���ʱ���������������Ƴ�һ��Ԫ�أ��ú�ɫ��ʾ������ԭ�ؽ�����뵽���ź���������С�



���������㷨��

���������ǵ����ģ�ÿ��ֻ�ƶ�һ��Ԫ�أ�ֱ������Ԫ�ؿ����γ�һ�����������б�
ÿ�ε����У���������ֻ�������������Ƴ�һ���������Ԫ�أ��ҵ������������ʵ���λ�ã���������롣
�ظ�ֱ�������������ݲ�����Ϊֹ��

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
   if(head ==null)
   return null;
   ListNode temp =new ListNode();
   temp.next = head;  
   ListNode last =head;
   ListNode cur = head.next;
   while(cur != null ){
       if(last.val <= cur.val){
           last = last.next;
       }else{
           ListNode pre = temp;
           while(pre.next.val <= cur.val){
               pre = pre.next;
           }
            last.next = cur.next;
            cur.next = pre.next;
            pre.next =cur;
       }
       cur = last.next;
   }
    return temp.next;
    }
}
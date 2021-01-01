编写一个程序，找到两个单链表相交的起始节点。
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        int len_A =0,len_B=0;
         ListNode node1 = headA;
          ListNode node2 = headB;
         while(node1 != null){
             node1 = node1.next;
             len_A++;
         }
         while(node2 != null){
             node2 = node2.next;
             len_B++;
         }
         node1 = headA;
         node2 =headB;
         if(len_A > len_B){
             for(int i=Math.abs(len_A-len_B);i>=1;i--)
                node1 = node1.next;
                while(node1 != node2){
                    node1=node1.next;
                    node2 =node2.next;
                }
                return node1;
             
         }else if(len_A < len_B){
             for(int i=Math.abs(len_A-len_B);i>=1;i--)
             node2 = node2.next;
                while(node1 != node2){
                    node1=node1.next;
                    node2 =node2.next;
                }   
                return node1;        
         }else{
               while(node1 != node2){
                    node1=node1.next;
                    node2 =node2.next;
                }   
                return node1;  
         }

    }
}
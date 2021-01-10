����һ�����������һ��ʱ�临�Ӷ�ΪO(n),����ռ临�Ӷ�ΪO(1)���㷨���ж����Ƿ�Ϊ���Ľṹ��

����һ�������ͷָ��A���뷵��һ��boolֵ���������Ƿ�Ϊ���Ľṹ����֤������С�ڵ���900��

����������
1->2->2->1
���أ�true

//�����м�ڵ㣬����벿�����ã�Ȼ��ֱ��ͷ��ʼ�Ƚ�
import java.util.*;

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class PalindromeList {
    public boolean chkPalindrome(ListNode A) {
        if(A == null){
            return false;
        }
        ListNode fast = A;
        ListNode slow = A;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode cur = slow.next;
        while(cur != null){
                ListNode next = cur.next;
                cur.next = slow;
                 slow = cur;
               cur = next;
        }

        while(A != slow){
			if(A.val != slow.val){
               return false;
            }
            if(A.next == slow){
                return true;
            }
            
             A = A.next;
               slow = slow.next;
        }
        return true;
    }
}
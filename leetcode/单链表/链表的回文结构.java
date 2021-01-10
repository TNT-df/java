对于一个链表，请设计一个时间复杂度为O(n),额外空间复杂度为O(1)的算法，判断其是否为回文结构。

给定一个链表的头指针A，请返回一个bool值，代表其是否为回文结构。保证链表长度小于等于900。

测试样例：
1->2->2->1
返回：true

//先找中间节点，将后半部分逆置，然后分别从头开始比较
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
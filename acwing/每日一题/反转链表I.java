
定义一个函数，输入一个链表的头结点，反转该链表并输出反转后链表的头结点。

思考题：

请同时实现迭代版本和递归版本。
样例
输入:1->2->3->4->5->NULL

输出:5->4->3->2->1->NULL
迭代
class Solution {
    public ListNode reverseList(ListNode head) {
        //
        if(head == null || head.next == null) return head;
        ListNode prev = head,cur = prev.next;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head.next = null;
        return prev;
    }
}
递归
  public ListNode reverseList(ListNode head) {
         if(head == null || head.next == null) return head;
          ListNode tail = reverseList(head.next);
          head.next.next = head;
          head.next =null;
          return tail;

    }

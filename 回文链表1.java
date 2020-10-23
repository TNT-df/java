请判断一个链表是否为回文链表。

示例 1:

输入: 1->2
输出: false
示例 2:

输入: 1->2->2->1
输出: true
/**

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 class Solution {
    public boolean isPalindrome(ListNode head) {
    List<Integer> list = new ArrayList<>();
    ListNode pre = head;
    while(null != pre){
        list.add(pre.val);
        pre = pre.next;
    }
    int start = 0;
    int end =list.size() - 1;
    while(start < end){
        if(!(list.get(start) == list.get(end))){
           return false;
        }else{
           start ++;
           end --;
        }
    }
    return true;
    }
}
class Solution {
    public boolean isPalindrome(ListNode head) {
   if(head == null){
       return true;
   }
   ListNode first = FoundMidNode(head); //找到中间结点
   ListNode second = reverseList(first.next);//反转中间节点的后面内容

   ListNode p1= head;
   ListNode p2 = second;
   boolean flag = true;
   while(flag && p2!=null){
       if(p1.val == p2.val){
           p1=p1.next;
           p2=p2.next;
       }else{
           flag = false;
       }
   }
   first.next =reverseList(second);//复原链表
    return flag;
    }
    //找到中间节点
    public ListNode FoundMidNode(ListNode head){
    ListNode slow =head;
    ListNode fast = head;
    while(fast.next!=null&&fast.next.next!=null){
        slow =slow.next;
        fast = fast.next.next;
    }
    return slow;
    }
    //反转中间节点的剩余链表
    public ListNode reverseList(ListNode node){
        ListNode pre =null;
        ListNode cur =node;
        while(cur != null){
            ListNode temp =cur.next;
            cur.next=pre;
            pre = cur;
            cur =temp;
        }
        return pre;
    }
}
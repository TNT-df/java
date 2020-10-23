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
        if(list.get(start)==list.get(end)){
            start++;
            end--;
        }else
            return false;
        
    }
    return true;
    }
}
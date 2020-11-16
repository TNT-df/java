给定一个以字符串表示的非负整数?num，移除这个数中的 k 位数字，使得剩下的数字最小。

注意:

num 的长度小于 10002 且≥ k。
num 不会包含任何前导零。
示例 1 :

输入: num = "1432219", k = 3
输出: "1219"
解释: 移除掉三个数字 4, 3, 和 2 形成一个新的最小的数字 1219。
示例 2 :

输入: num = "10200", k = 1
输出: "200"
解释: 移掉首位的 1 剩下的数字为 200. 注意输出不能有任何前导零。
示例 3 :

输入: num = "10", k = 2
输出: "0"
解释: 从原数字移除所有的数字，剩余为空就是0。

//解析
class Solution {
    public String removeKdigits(String num, int k) {
    if(num == " "|| k >= num.length())
      return "0";
    char [] ch = num.toCharArray();
    Stack<Character> stack = new Stack<>();
    for(char c:ch){  //遍历数组中的每一个元素
        while(!stack.isEmpty()&&k>0&stack.peek()>c){  //当前栈不为空，要移除的数的个数不为0，栈顶元素大于当前元素将大的元素移除
            stack.pop();
            k--;
        }
        if(stack.isEmpty()&&c=='0') continue;       //栈为空，当前字符为'0'跳过本次循环
        stack.push(c);
    }
   while(k>0){                               //遍历完数组后，k不为0将栈中k个元素移除
       stack.pop();
       k--;
   }
   if(stack.isEmpty())                       //如果栈为空返回'0';
   return "0";
   StringBuffer sb = new StringBuffer();
   while(!stack.isEmpty()){
       sb.append(stack.pop());       
   }
  
   return sb.reverse().toString(); //逆序输出栈中元素
    }
}
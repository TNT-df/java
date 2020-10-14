数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。

 

示例：

输入：n = 3
输出：[
       "((()))",
       "(()())",
       "(())()",
       "()(())",
       "()()()"
     ]

class Solution {
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
       dfs(new StringBuilder(),0,0,n);
       return list;
    }
    public void dfs(StringBuilder cur,int left,int right,int max){
        if(cur.length()== max * 2){  //cur.length（）= 括号数的2倍返回
            list.add(cur.toString());
            return;
        }
     if(left < max){               //先加入左括号，再加右括号
         cur.append('(');
         dfs(cur,left+1,right,max);
         cur.deleteCharAt(cur.length()-1); //回溯
     }
     if(right < left){         //右括号的个数小于左括号
         cur.append(')');
         dfs(cur,left,right+1,max);
         cur.deleteCharAt(cur.length()-1); //回溯
     }
    }
}
给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。

注意：如果对空文本输入退格字符，文本继续为空。

 

示例 1：

输入：S = "ab#c", T = "ad#c"
输出：true
解释：S 和 T 都会变成 “ac”。


class Solution {
    public boolean backspaceCompare(String S, String T) {
    return solve(S).equals(solve(T));
    }
   public String solve(String str){
       StringBuffer strbuff = new StringBuffer();
       for(int i = 0;i<str.length();i++){
           if(str.charAt(i)!='#'){
               strbuff.append(str.charAt(i));
           }else{
               if(strbuff.length()>0){
                    strbuff.deleteCharAt(strbuff.length() - 1);
               }
           }
       }
       return strbuff.toString();
   }
  
    }



编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。

示例 1:

输入: ["flower","flow","flight"]
输出: "fl"
示例 2:

输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。
/**
 1.若数组长度为0，返回空；
 2.将数组第一个元素赋值给str，str==最长公共子序列，两两逐个比较找最长公共子序列
 3.若str为空，直接返回
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
   if(strs.length==0){
       return "";
   }
   String str = strs[0];
   for(int i = 1;i < strs.length;i++){
       int j=0;
      for(;j<strs[i].length()&&j<str.length();j++){
        if(str.charAt(j)!=strs[i].charAt(j)){
            break;
        }       
      }
      str=str.substring(0,j);
      if(str==" "){
            return str;
        }
   }
   return str;
    }
}
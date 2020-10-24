给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。

示例 1:

输入: s = "anagram", t = "nagaram"
输出: true
示例 2:

输入: s = "rat", t = "car"
输出: false

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        return false;
    int[] a = new int[26];
    for(int i = 0;i<s.length();i++){
        a[s.charAt(i)-'a']++;
          a[t.charAt(i)-'a']--;
    }
    for(int temp : a){
        if(temp != 0){
            return false;
        }
    }
    return true;
    }
}

//排序比较
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
   char[] s1 = s.toCharArray();
    char[] t1 = t.toCharArray();
    Arrays.sort(s1);
    Arrays.sort(t1);
    return Arrays.equals(s1,t1);
    }
}



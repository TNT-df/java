给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。

你可以按任意顺序返回答案。

 

示例 1：

输入：["bella","label","roller"]
输出：["e","l","l"]
示例 2：

输入：["cool","lock","cook"]
输出：["c","o"]

class Solution {
    public List<String> commonChars(String[] A) {
   int[] chCount = new int[26];
   //将第一个字符串每个位放入数组中
    for(int i = 0; i<A[0].length();i++){
        chCount[A[0].charAt(i)-'a']++;
    }
    for(int i = 1;i<A.length;i++){
     int[] cur = new int[26];
     for(int j = 0;j<A[i].length();j++){
        cur[A[i].charAt(j)-'a']++;
      }
      //将第i个字符串得到的数组与chCount数组中的元素比较取小的即可
      for(int k = 0;k<26;k++){
          chCount[k]=Math.min(chCount[k],cur[k]);
      }
    }
    //此时chCount数组中不为0的数字即为最小的元素个数
    List<String> result = new ArrayList<>();
    for(int i =0;i<26;i++){
        while(chCount[i]!=0){
            result.add(String.valueOf((char)(i+'a')));
            chCount[i]--;
        }
    }
    return result;
  }
}
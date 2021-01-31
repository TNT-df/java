如果交换字符串 X 中的两个不同位置的字母，使得它和字符串 Y 相等，那么称 X 和 Y 两个字符串相似。如果这两个字符串本身是相等的，那它们也是相似的。

例如，"tars" 和 "rats" 是相似的 (交换 0 与 2 的位置)； "rats" 和 "arts" 也是相似的，但是 "star" 不与 "tars"，"rats"，或 "arts" 相似。

总之，它们通过相似性形成了两个关联组：{"tars", "rats", "arts"} 和 {"star"}。注意，"tars" 和 "arts" 是在同一组中，即使它们并不相似。形式上，对每个组而言，要确定一个单词在组中，只需要这个词和该组中至少一个单词相似。

给你一个字符串列表 strs。列表中的每个字符串都是 strs 中其它所有字符串的一个字母异位词。请问 strs 中有多少个相似字符串组？

 

示例 1：

输入：strs = ["tars","rats","arts","star"]
输出：2
示例 2：

输入：strs = ["omv","ovm"]
输出：1
 
/*
将每个字符串看作为一个连通分量，若两个字符串相似则进行相连，统计连通分量的个数
*/
class Solution {
    int [] p ;
    public int numSimilarGroups(String[] strs) {
        int len = strs.length;
        p = new int [len];
         //初始化联通分量，将每个字符串看做一个点。
        for(int i = 0 ;i < len ;i++)
          p[i] = i;

          for(int i = 0; i < len ;i++)
            for(int j = i + 1;j < len ;j++){
                if(find(i) == find(j))  
                continue;
                if(checked(strs[i],strs[j])){
                     p[find(i)] = find(j);  //若相似，则进行相连
                }
            }

            int ret = 0;
            //判断连通分量的个数
            for(int i = 0 ;i<len;i++){
                if(p[i] == i)
                ret++;
            }
            return ret;
    }

    public int find(int x){
        if(p[x] != x){
            x = find(p[x]);
        }
        return x;
    }
  //判断两个字符串是否是相似的(若两个字符串同一位置的不同字母个数大于2则说明两个字母不是相似)
    public boolean checked(String str1,String str2){
        int len = str1.length();
        int sum = 0;
        int i = 0;
        while(i < len){
            if(str1.charAt(i) != str2.charAt(i))
             sum++;
             i++;
             if( sum > 2) return false;
        }
        return true;
    }
}
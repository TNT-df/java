给定两个单词（beginWord 和 endWord）和一个字典，找到从 beginWord 到 endWord 的最短转换序列的长度。转换需遵循如下规则：

每次转换只能改变一个字母。
转换过程中的中间单词必须是字典中的单词。
说明:

如果不存在这样的转换序列，返回 0。
所有单词具有相同的长度。
所有单词只由小写字母组成。
字典中不存在重复的单词。
你可以假设 beginWord 和 endWord 是非空的，且二者不相同。
示例 1:

输入:
beginWord = "hit",
endWord = "cog",
wordList = ["hot","dot","dog","lot","log","cog"]

输出: 5

解释: 一个最短转换序列是 "hit" -> "hot" -> "dot" -> "dog" -> "cog",
     返回它的长度 5。
示例 2:

//深搜
class Solution {
       public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //把字典中的单词放入到set中，主要是为了方便查询
        Set<String> dictSet = new HashSet<>(wordList);
        //创建一个新的单词，记录单词是否被访问过，如果没被访问过就加入进来
        Set<String> visit = new HashSet<>();

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        //这里的图是一圈一圈往外扩散的，这里的minlen可以看做扩散了多少圈，
        //也就是最短的转换序列长度
        int minlen = 1;
        while (!queue.isEmpty()) {
            //这里找出每个节点周围的节点数量，然后都遍历他们
            int levelCount = queue.size();
            for (int i = 0; i < levelCount; i++) {
                //出队
                String word = queue.poll();
                //这里遍历每一个节点的单词，然后修改其中一个字符，让他成为一个新的单词，
                //并查看这个新的单词在字典中是否存在，如果存在并且没有被访问过，就加入到队列中
                for (int j = 0; j < word.length(); j++) {
                    char[] ch = word.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == word.charAt(j))
                            continue;
                        ch[j] = c;
                     构建一个新的单词
                        String newWord = String.valueOf(ch);
                        //查看字典中有没有这个单词，如果有并且没有被访问过，就加入到队列中

                        if (dictSet.contains(newWord) && visit.add(newWord)) {
                            //如果新单词是endWord就返回,这里访问的是第minlen圈的节点，然后
                            //新建的节点就是第minlen+1层
                            if (newWord.equals(endWord))
                                return minlen + 1;
                            queue.add(newWord);
                        }
                    }
                }
            }

            minlen++;
        }
        return 0;
    }

}
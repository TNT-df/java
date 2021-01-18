

维护一个字符串集合，支持两种操作：

“I x”向集合中插入一个字符串x；
“Q x”询问一个字符串在集合中出现了多少次。
共有N个操作，输入的字符串总长度不超过 105，字符串仅包含小写英文字母。

输入格式
第一行包含整数N，表示操作数。

接下来N行，每行包含一个操作指令，指令为”I x”或”Q x”中的一种。

输出格式
对于每个询问指令”Q x”，都要输出一个整数作为结果，表示x在集合中出现的次数。

每个结果占一行。

数据范围
1≤N≤2?104
输入样例：
5
I abc
Q abc
Q ab
I ab
Q ab
输出样例：
1
0
1
package com.df.acwing;

import java.util.Scanner;

/**
 * @Author TNT-df
 * @Date 2021/1/3 13:46
 * @Description Trie字符串统计 高效地存储和查找字符串
 */
public class AC835 {
    static final int N = 100010;
    static int[][] son = new int[N][26];
    static int[] cnt = new int[N];  //当前字母结尾的字符串的个数
    static int index = 0;

    public static void Insert(String str) {
        int p = 0;
        for (int i = 0; i < str.length(); i++) {
            int x = str.charAt(i) - 'a';
            if (son[p][x] == 0) son[p][x] = ++index;  //不存在则创建
            p = son[p][x]; //存在则向下搜索
        }
        cnt[p]++;
    }

    public static int Query(String str) {
        int p = 0;
        for (int i = 0; i < str.length(); i++) {
            int x = str.charAt(i) - 'a';
            if (son[p][x] == 0) return 0;
            p = son[p][x];
        }
        return cnt[p];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        while (n-- > 0) {
            String str = in.next();
            String str2 = in.next();
            if (str.equals("I"))
                Insert(str2);
            else {
                System.out.println(Query(str2));
            }
        }
    }
}

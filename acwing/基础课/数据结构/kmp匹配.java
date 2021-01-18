给定一个模式串S，以及一个模板串P，所有字符串中只包含大小写英文字母以及阿拉伯数字。

模板串P在模式串S中多次作为子串出现。

求出模板串P在模式串S中所有出现的位置的起始下标。

输入格式
第一行输入整数N，表示字符串P的长度。

第二行输入字符串P。

第三行输入整数M，表示字符串S的长度。

第四行输入字符串S。

输出格式
共一行，输出所有出现位置的起始下标（下标从0开始计数），整数之间用空格隔开。

数据范围
1≤N≤105
1≤M≤106
输入样例：
3
aba
5
ababa
输出样例：


0 2
package com.df.acwing;


/**
 * @Author TNT-df
 * @Date 2020/12/31 23:34
 * @Description KMP
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AC831 {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());

        // 模式串p
        String P = reader.readLine();
        char[] p = new char[n + 1];
        for (int i = 1; i <= n; i++)
            p[i] = P.charAt(i - 1);

        int m = Integer.parseInt(reader.readLine());
        String S = reader.readLine();
        // 总串s
        char[] s = new char[m + 1];
        for (int i = 1; i <= m; i++)
            s[i] = S.charAt(i - 1);

        // 构造前缀数组
        int ne[] = new int[n+1];
        //ne[]代表匹配串中，最大的前后缀相同的长度
        for (int i = 2, j = 0; i < n; i++) {
            //i从2开始，因为ne[1]肯定为0
            while (j != 0 && p[i] != p[j + 1])
                j = ne[j];
            if (p[i] == p[j + 1])
                j++;
            ne[i] = j;
        }

        // kmp匹配
        for (int i = 1, j = 0; i <= m; i++) {
            while (j != 0 && s[i] != p[j + 1]) {
                j = ne[j]; // s[i] != p[j + 1]即不匹配，则往后移动
            }
            if (s[i] == p[j + 1])
                j++; // 匹配时将j++进行下一个字符得匹配
            if (j == n) { // 匹配了n字符了即代表完全匹配了
                writer.write(i - n +" ");
                j = ne[j]; // 完全匹配后继续搜索
            }
        }
        writer.flush();
        writer.close();
        reader.close();
    }

}




ά��һ���ַ������ϣ�֧�����ֲ�����

��I x���򼯺��в���һ���ַ���x��
��Q x��ѯ��һ���ַ����ڼ����г����˶��ٴΡ�
����N��������������ַ����ܳ��Ȳ����� 105���ַ���������СдӢ����ĸ��

�����ʽ
��һ�а�������N����ʾ��������

������N�У�ÿ�а���һ������ָ�ָ��Ϊ��I x����Q x���е�һ�֡�

�����ʽ
����ÿ��ѯ��ָ�Q x������Ҫ���һ��������Ϊ�������ʾx�ڼ����г��ֵĴ�����

ÿ�����ռһ�С�

���ݷ�Χ
1��N��2?104
����������
5
I abc
Q abc
Q ab
I ab
Q ab
���������
1
0
1
package com.df.acwing;

import java.util.Scanner;

/**
 * @Author TNT-df
 * @Date 2021/1/3 13:46
 * @Description Trie�ַ���ͳ�� ��Ч�ش洢�Ͳ����ַ���
 */
public class AC835 {
    static final int N = 100010;
    static int[][] son = new int[N][26];
    static int[] cnt = new int[N];  //��ǰ��ĸ��β���ַ����ĸ���
    static int index = 0;

    public static void Insert(String str) {
        int p = 0;
        for (int i = 0; i < str.length(); i++) {
            int x = str.charAt(i) - 'a';
            if (son[p][x] == 0) son[p][x] = ++index;  //�������򴴽�
            p = son[p][x]; //��������������
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

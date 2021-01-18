����һ��ģʽ��S���Լ�һ��ģ�崮P�������ַ�����ֻ������СдӢ����ĸ�Լ����������֡�

ģ�崮P��ģʽ��S�ж����Ϊ�Ӵ����֡�

���ģ�崮P��ģʽ��S�����г��ֵ�λ�õ���ʼ�±ꡣ

�����ʽ
��һ����������N����ʾ�ַ���P�ĳ��ȡ�

�ڶ��������ַ���P��

��������������M����ʾ�ַ���S�ĳ��ȡ�

�����������ַ���S��

�����ʽ
��һ�У�������г���λ�õ���ʼ�±꣨�±��0��ʼ������������֮���ÿո������

���ݷ�Χ
1��N��105
1��M��106
����������
3
aba
5
ababa
���������


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

        // ģʽ��p
        String P = reader.readLine();
        char[] p = new char[n + 1];
        for (int i = 1; i <= n; i++)
            p[i] = P.charAt(i - 1);

        int m = Integer.parseInt(reader.readLine());
        String S = reader.readLine();
        // �ܴ�s
        char[] s = new char[m + 1];
        for (int i = 1; i <= m; i++)
            s[i] = S.charAt(i - 1);

        // ����ǰ׺����
        int ne[] = new int[n+1];
        //ne[]����ƥ�䴮�У�����ǰ��׺��ͬ�ĳ���
        for (int i = 2, j = 0; i < n; i++) {
            //i��2��ʼ����Ϊne[1]�϶�Ϊ0
            while (j != 0 && p[i] != p[j + 1])
                j = ne[j];
            if (p[i] == p[j + 1])
                j++;
            ne[i] = j;
        }

        // kmpƥ��
        for (int i = 1, j = 0; i <= m; i++) {
            while (j != 0 && s[i] != p[j + 1]) {
                j = ne[j]; // s[i] != p[j + 1]����ƥ�䣬�������ƶ�
            }
            if (s[i] == p[j + 1])
                j++; // ƥ��ʱ��j++������һ���ַ���ƥ��
            if (j == n) { // ƥ����n�ַ��˼�������ȫƥ����
                writer.write(i - n +" ");
                j = ne[j]; // ��ȫƥ����������
            }
        }
        writer.flush();
        writer.close();
        reader.close();
    }

}


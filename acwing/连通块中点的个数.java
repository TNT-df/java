����һ������n���㣨���Ϊ1~n��������ͼ����ʼʱͼ��û�бߡ�

����Ҫ����m�������������������֣�

��C a b�����ڵ�a�͵�b֮����һ���ߣ�a��b������ȣ�
��Q1 a b����ѯ�ʵ�a�͵�b�Ƿ���ͬһ����ͨ���У�a��b������ȣ�
��Q2 a����ѯ�ʵ�a������ͨ���е��������
�����ʽ
��һ����������n��m��

������m�У�ÿ�а���һ������ָ�ָ��Ϊ��C a b������Q1 a b����Q2 a���е�һ�֡�

�����ʽ
����ÿ��ѯ��ָ�Q1 a b�������a��b��ͬһ����ͨ���У��������Yes�������������No����

����ÿ��ѯ��ָ�Q2 a�������һ��������ʾ��a������ͨ���е������

ÿ�����ռһ�С�

���ݷ�Χ
1��n,m��105
����������
5 5
C 1 2
Q1 1 2
Q2 1
C 2 5
Q2 5
���������
Yes
2
3

package com.df.acwing.DataSTRUCT;

import java.io.*;

/**
 * @Author TNT-df
 * @Date 2021/1/3 20:08
 * @Description  ��ͨ���е������
 */
public class AC837 {
    static final int N = 100010;
    static int[] p = new int[N];
    static int[] size = new int[N]; //�洢ÿ�������нڵ�ĸ���

    public static int find(int x) {
        if (p[x] != x) {
            x = find(p[x]);
        }
        return x;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = reader.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        for (int i = 1; i <= n; i++) {
            p[i] = i;
            size[i] = 1;
        }
        while (m-- > 0) {
            String[] st = reader.readLine().split(" ");

            if (st[0].equals("C")) {
                int a = Integer.valueOf(st[1]);
                int b = Integer.valueOf(st[2]);
                a = find(a);
                b = find(b);
                if (a != b ) {
                    p[a] = b;   //����a �ͼ���b ��ͨ�� ����a�е�Ԫ�ظ������뵽����b��
                    size[b] += size[a];
                }
            } else if (st[0].equals("Q1")) {
                int a = Integer.valueOf(st[1]);
                int b = Integer.valueOf(st[2]);
                if (find(a) == find(b)) {
                    writer.write("Yes\n");
                } else {
                    writer.write("No\n");
                }
            } else {
                int a = Integer.valueOf(st[1]);
                writer.write(size[find(a)] + "\n");
            }
        }
        writer.flush();
        writer.close();
        reader.close();
    }
}



����һ������Ϊn���ַ������ٸ���m��ѯ�ʣ�ÿ��ѯ�ʰ����ĸ�����l1,r1,l2,r2�������ж�[l1,r1]��[l2,r2]�������������������ַ����Ӵ��Ƿ���ȫ��ͬ��

�ַ�����ֻ������СдӢ����ĸ�����֡�

�����ʽ
��һ�а�������n��m����ʾ�ַ������Ⱥ�ѯ�ʴ�����

�ڶ��а���һ������Ϊn���ַ������ַ�����ֻ������СдӢ����ĸ�����֡�

������m�У�ÿ�а����ĸ�����l1,r1,l2,r2����ʾһ��ѯ�����漰���������䡣

ע�⣬�ַ�����λ�ô�1��ʼ��š�

�����ʽ
����ÿ��ѯ�����һ���������������ַ����Ӵ���ȫ��ͬ�������Yes�������������No����

ÿ�����ռһ�С�

���ݷ�Χ
1��n,m��105
����������
8 3
aabbaabb
1 3 5 7
1 3 6 8
1 2 1 2
���������
Yes
No
Yes
package com.df.acwing.DataSTRUCT;

import java.util.Scanner;

/**
 * @Author TNT-df
 * @Date 2021/1/5 23:06
 * @Description �ַ�����ϣ
 */
public class AC841 {
    static final int N = 100010;
    static long h[] = new long[N];
    static long p[] = new long[N];
    static final int P = 131;

    public static long get(int l, int r) {

        return h[r] - h[l - 1] *  p[r-l + 1];  //�õ��Ӵ��Ĺ�ϣֵ
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        String str = in.next();
        p[0] = 1;
        for (int i = 1; i <= n; i ++) {
            p[i] = p[i - 1] * P;

            h[i] = h[i - 1] * P + str.charAt(i-1);
        }
        while (m-- > 0) {
            int l1 = in.nextInt();
            int r1 = in.nextInt();
            int l2 = in.nextInt();
            int r2 = in.nextInt();
            if (get(l1, r1) == get(l2, r2)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
����һ������Ϊn���������У���С�������ǰmС������

�����ʽ
��һ�а�������n��m��

�ڶ��а���n����������ʾ�������С�

�����ʽ
��һ�У�����m����������ʾ����������ǰmС������

���ݷ�Χ
1��m��n��105��
1��������Ԫ�ء�109
����������
5 3
4 5 1 3 2
���������
1 2 3

import java.util.*;

/**
 * @huthor TNT-df
 * @Dhte 2021/1/3 18:22
 * @Description ������
 */
public class Main {
    static final int N = 100010;
    static int[] h = new int[N];
    static int size = 0; //�洢���е�Ԫ�ظ���

    public static void down(int x) {
        int t = x;
        //�������Ӳ��ҵ�ǰ�ڵ��������
        if (x * 2 <= size && h[t] > h[t * 2]) {
            t = x * 2;  //��¼����λ��
        }
        //�����Һ��Ӳ������ӵ�ֵ�����Һ��ӵ�ֵ
        if (x * 2 + 1 <= size && h[t] > h[x * 2 + 1]) {
            t = x * 2 + 1;//��¼��Сֵ���±�
        }
        if (x != t) {  //��ǰ������Сֵ����Ҫ���н�����ͬʱ��t�������λ��
            int temp = h[x];
            h[x] = h[t];
            h[t] = temp;
            down(t);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 1; i <= n; i++) {
            h[i] = in.nextInt();
            size++;
        }
        for (int i = n / 2; i > 0; i--) {
            down(i);
        }
        while (m-- > 0) {
            System.out.print(h[1] + " ");
            h[1] = h[size--];
            down(1);
        }
    }
}

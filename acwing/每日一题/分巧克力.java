��ͯ�������� K λС���ѵ�С�������͡�

С���ó�����ص��ɿ����д�С�����ǡ�

С��һ���� N ���ɿ��������е� i ���� Hi��Wi �ķ�����ɵĳ����Ρ�

Ϊ�˹�ƽ�����С����Ҫ���� N ���ɿ������г� K ���ɿ����ָ�С�����ǡ�

�г����ɿ�����Ҫ���㣺

��״�������Σ��߳�������
��С��ͬ
����һ�� 6��5 ���ɿ��������г� 6 �� 2��2 ���ɿ������� 2 �� 3��3 ���ɿ�����

��ȻС�����Ƕ�ϣ���õ����ɿ��������ܴ����ܰ�С����������ı߳��Ƕ���ô��

�����ʽ
��һ�а����������� N �� K��

���� N ��ÿ�а����������� Hi �� Wi��

���뱣֤ÿλС���������ܻ��һ�� 1��1 ���ɿ�����

�����ʽ
����г����������ɿ��������ܵı߳���

���ݷ�Χ
1��N,K��105,
1��Hi,Wi��105
����������
2 10
6 5
5 6
���������
2

//����˼�룬�����䲻����С�ҵ����Ž�
/*�汾1
�����ǽ�����[l, r]���ֳ�[l, mid]��[mid + 1, r]ʱ������²�����r = mid����l = mid + 1;������midʱ����Ҫ��1��

while (l < r)
{
    int mid = l + r >> 1;
    if (check(mid)) r = mid;
    else l = mid + 1;
}
return l;
�汾2
�����ǽ�����[l, r]���ֳ�[l, mid - 1]��[mid, r]ʱ������²�����r = mid - 1����l = mid;����ʱΪ�˷�ֹ��ѭ��������midʱ��Ҫ��1��

while (l < r)
{
    int mid = l + r + 1 >> 1;
    if (check(mid)) l = mid;
    else r = mid - 1;
}
return l;
*/

import java.util.*;
public class Main{
    static final int N = 100010;
    static int n;
    static int K;
    static int[] h = new int[N];
    static int[] w = new int[N];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        K = in.nextInt();
        for(int i = 0;i<n;i++){
            h[i] = in.nextInt();
            w[i] =in.nextInt();
        }
        int l = 1,r =(int)1e5;
        while(l < r){
            int mid = l + r +1 >>1;
            if(check(mid)) l = mid;
            else r = mid -1;
        }
        System.out.println(r);
    }
    static boolean check(int mid){
        long cnt = 0;
        for(int i = 0;i < n;i ++){
            cnt += (long)(h[i]/mid)*(w[i]/mid);
            if(cnt >=K)
            return true;
        }
        return false;
    }
}
����һ����СΪn��106�����顣

��һ����СΪk�Ļ������ڣ����������������ƶ������ұߡ�

��ֻ���ڴ����п���k�����֡�

ÿ�λ������������ƶ�һ��λ�á�

������һ�����ӣ�

������Ϊ[1 3 -1 -3 5 3 6 7]��kΪ3��

����λ��	��Сֵ	���ֵ
[1 3 -1] -3 5 3 6 7	-1	3
1 [3 -1 -3] 5 3 6 7	-3	3
1 3 [-1 -3 5] 3 6 7	-3	5
1 3 -1 [-3 5 3] 6 7	-3	5
1 3 -1 -3 [5 3 6] 7	3	6
1 3 -1 -3 5 [3 6 7]	3	7
����������ȷ����������λ��ÿ��λ��ʱ�������е����ֵ����Сֵ��

�����ʽ
����������С�

��һ�а�����������n��k���ֱ�������鳤�Ⱥͻ������ڵĳ��ȡ�

�ڶ�����n����������������ľ�����ֵ��

ͬ������֮���ÿո������

�����ʽ
�������������

��һ��������������ң�ÿ��λ�û��������е���Сֵ��

�ڶ���������������ң�ÿ��λ�û��������е����ֵ��

����������
8 3
1 3 -1 -3 5 3 6 7
���������
-1 -3 -3 -3 3 3
3 3 5 5 6 7

package com.df.acwing;

import java.io.*;

/**
 * @Author TNT-df
 * @Date 2021/1/2 22:37
 * @Description ��������
 */
public class AC154 {
    static final int N = 1000010;
    static int[] q = new int[N];  // ��������, ���д�� arr���±�ֵ
    static int[] arr = new int[N];
    static int hh = 0, tt = -1;  // ttָ��ջ��Ԫ��

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s1 = br.readLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        int k = Integer.parseInt(s1[1]);

        String[] str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        for (int i = 0; i < n; i++) {
            while (hh <= tt && i - k + 1 > q[hh]) hh++; //ά�����������е�Ԫ�ظ�ʽΪk�������е�Ԫ����󲻳���K
            while (hh <= tt && arr[q[tt]] > arr[i]) tt--; //��βԪ�ش��ڵ�ǰԪ�ض�β����
            q[++tt] = i; //��ǰԪ�ص��±�������
            if (i + 1 >= k) {  //��ʼ��ӡԪ��
                wr.write(arr[q[hh]] + " ");
            }
        }
        wr.write("\n");
        hh = 0;
        tt = -1;
        for (int i = 0; i < n; i++) {
            while (hh <= tt && i - k + 1 > q[hh]) hh++;
            while (hh <= tt && arr[q[tt]] < arr[i]) tt--;
            q[++tt] = i;
            if (i + 1 >=k){
                wr.write(arr[q[hh]]+" ");
            }
        }
        wr.flush();
        wr.close();
        br.close();
    }
}

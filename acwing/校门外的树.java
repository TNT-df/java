ĳУ�����ⳤ��ΪL����·����һ������ÿ�������ڵ���֮��ļ������1�ס�

���ǿ��԰���·����һ�����ᣬ��·��һ��������0��λ�ã���һ����L��λ�ã������ϵ�ÿ�������㣬��0��1��2��������L��������һ������

������·����һЩ����Ҫ������������

��Щ�����������������ϵ���ʼ�����ֹ���ʾ��

��֪��һ�������ʼ�����ֹ������궼������������֮��������غϵĲ��֡�

����Ҫ����Щ�����е�������������˵㴦�������������ߡ�

��������Ǽ��㽫��Щ�������ߺ���·�ϻ��ж��ٿ�����

�����ʽ
�����ļ��ĵ�һ������������L��M��L������·�ĳ��ȣ�M�����������Ŀ��L��M֮����һ���ո������

��������M��ÿ�а���������ͬ����������һ���ո��������ʾһ���������ʼ�����ֹ������ꡣ

�����ʽ
����ļ�����һ�У���һ��ֻ����һ����������ʾ��·��ʣ���������Ŀ��

���ݷ�Χ
1��L��10000,
1��M��100
����������
500 3
150 300
100 200
470 471
���������
298

import java.util.*;

public class Main{
    static int K;
    static int L;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
         K = in.nextInt();
         L = in.nextInt();

        boolean a[] = new boolean [K+1];
        while(L-- > 0){
            int l = in.nextInt();
            int r =in.nextInt();
            for(int i  = l; i<=r;i++){
                if(a[i]!=true){
                    a[i] = true;
                }
            }
        }
        int cnt =0;
       for(int i =0;i<K+1;i++){
           if(a[i] == false){
               cnt++;
           }
       }
        System.out.println(cnt);
    }
}
����ϲ�


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @Author TNT-df
 * @Date 2021/1/16 13:09
 * @Description
 */
public class Main {
    static int L;
    static int M;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<int[]> list = new ArrayList<>();
        L = in.nextInt();
        M = in.nextInt();
        int [][] a= new int[M][2];
        for (int i = 0; i < M; i++) {
            for(int j = 0;j<2;j++){
                a[i][j] =in.nextInt();
            }
        }
        for (int[] k : a
        ) {
        list.add(k);
        }
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int l = list.get(0)[0], r = list.get(0)[1];

        int sum = 0;
        for (int i = 1; i < list.size(); i++) {
        //r������˵�ֵ��˵���н�������������Ҷ˵�
        //����˵����ǰ����û�н���
            if (list.get(i)[0] < r) {
                r = Math.max(r, list.get(i)[1]);
            } else {
                sum += r - l + 1;
                l = list.get(i)[0];
                r = list.get(i)[1];
            }
        }
        sum += r - l + 1;
        System.out.print(L - sum + 1);
    }
}


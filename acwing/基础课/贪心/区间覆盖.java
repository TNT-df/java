package com.df.acwing.tanxin;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
给定N个闭区间[ai,bi]以及一个线段区间[s,t]，请你选择尽量少的区间，将指定线段区间完全覆盖。

输出最少区间数，如果无法完全覆盖则输出-1。

输入格式
第一行包含两个整数s和t，表示给定线段区间的两个端点。

第二行包含整数N，表示给定区间数。

接下来N行，每行包含两个整数ai,bi，表示一个区间的两个端点。

输出格式
输出一个整数，表示所需最少区间数。

如果无解，则输出-1。

数据范围
1≤N≤105,
−109≤ai≤bi≤109,
−109≤s≤t≤109
输入样例：
1 5
3
-1 3
2 4
3 5
输出样例：
2
import java.util.Scanner;

/**
 * @Author: tnt-DF
 * @Date: 2021/2/15 15:13
 * @Description: 区间覆盖
 * @Version: 1.0
 */
public class AC907 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int n = in.nextInt();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            list.add(new int[]{a, b});
        }
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int res = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            int j = i;
            int r_max = Integer.MIN_VALUE;
            //遍历所有区间左端点在start左边，右端点的最大值
            while (j < n && list.get(j)[0] <= start) {
                r_max = Math.max(r_max, list.get(j)[1]);
                j++;
            }
            if (r_max < start) {
                res = -1;
                break;
            }
            res++;
            if (r_max >= end) {
                flag = true;
                break;
            }
            start = r_max;
            i = j - 1;
        }
        if (!flag) res = -1;
        System.out.println(res);
    }
}

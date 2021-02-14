给定N个闭区间[ai,bi]，请你将这些区间分成若干组，使得每组内部的区间两两之间（包括端点）没有交集，并使得组数尽可能小。

输出最小组数。

输入格式
第一行包含整数N，表示区间数。

接下来N行，每行包含两个整数ai,bi，表示一个区间的两个端点。

输出格式
输出一个整数，表示最小组数。

数据范围
1≤N≤105,
−109≤ai≤bi≤109
输入样例：
3
-1 1
2 4
3 5
输出样例：
2
/*
1.按照左端点排序
2.用heap维护一个组中最右端点，heap中点的个数即为分组的个数
*/
package com.df.acwing.tanxin;

import java.util.*;

/**
 * @Author: tnt-DF
 * @Date: 2021/2/14 21:24
 * @Description: 区间分组
 * @Version: 1.0
 */
public class AC906 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        //小根堆维护上一组的最右端点
        for (int i = 0; i < n; i++) {
            int[] temp = list.get(i);
            if (heap.isEmpty() || temp[0] <= heap.peek()) {
                heap.offer(temp[1]);
            } else {
                //  当前没有区间没有交集更新最大右端点的值
                heap.poll();
                heap.offer(temp[1]);
            }
        }
        System.out.println(heap.size());
    }
}

给定N个闭区间[ai,bi]，请你在数轴上选择尽量少的点，使得每个区间内至少包含一个选出的点。

输出选择的点的最小数量。

位于区间端点上的点也算作区间内。

输入格式
第一行包含整数N，表示区间数。

接下来N行，每行包含两个整数ai,bi，表示一个区间的两个端点。

输出格式
输出一个整数，表示所需的点的最小数量。

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

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: tnt-DF
 * @Date: 2021/2/14 20:49
 * @Description:
 * @Version: 1.0
 */
public class Main {
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
                return o1[1] - o2[1];
            }
        });

        int res = 0, lim = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            int temp[] = list.get(i);
            if (temp[0] > lim) {
                res++;
                lim = temp[1];
            }
        }
        System.out.println(res);
    }

}



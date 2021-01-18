给定一个大小为n≤106的数组。

有一个大小为k的滑动窗口，它从数组的最左边移动到最右边。

您只能在窗口中看到k个数字。

每次滑动窗口向右移动一个位置。

以下是一个例子：

该数组为[1 3 -1 -3 5 3 6 7]，k为3。

窗口位置	最小值	最大值
[1 3 -1] -3 5 3 6 7	-1	3
1 [3 -1 -3] 5 3 6 7	-3	3
1 3 [-1 -3 5] 3 6 7	-3	5
1 3 -1 [-3 5 3] 6 7	-3	5
1 3 -1 -3 [5 3 6] 7	3	6
1 3 -1 -3 5 [3 6 7]	3	7
您的任务是确定滑动窗口位于每个位置时，窗口中的最大值和最小值。

输入格式
输入包含两行。

第一行包含两个整数n和k，分别代表数组长度和滑动窗口的长度。

第二行有n个整数，代表数组的具体数值。

同行数据之间用空格隔开。

输出格式
输出包含两个。

第一行输出，从左至右，每个位置滑动窗口中的最小值。

第二行输出，从左至右，每个位置滑动窗口中的最大值。

输入样例：
8 3
1 3 -1 -3 5 3 6 7
输出样例：
-1 -3 -3 -3 3 3
3 3 5 5 6 7

package com.df.acwing;

import java.io.*;

/**
 * @Author TNT-df
 * @Date 2021/1/2 22:37
 * @Description 滑动窗口
 */
public class AC154 {
    static final int N = 1000010;
    static int[] q = new int[N];  // 队列数组, 其中存放 arr的下标值
    static int[] arr = new int[N];
    static int hh = 0, tt = -1;  // tt指向栈顶元素

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
            while (hh <= tt && i - k + 1 > q[hh]) hh++; //维护滑动窗口中的元素格式为k，队列中的元素最大不超过K
            while (hh <= tt && arr[q[tt]] > arr[i]) tt--; //队尾元素大于当前元素队尾出队
            q[++tt] = i; //当前元素的下标加入队列
            if (i + 1 >= k) {  //开始打印元素
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

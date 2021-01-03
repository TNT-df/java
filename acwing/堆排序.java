输入一个长度为n的整数数列，从小到大输出前m小的数。

输入格式
第一行包含整数n和m。

第二行包含n个整数，表示整数数列。

输出格式
共一行，包含m个整数，表示整数数列中前m小的数。

数据范围
1≤m≤n≤105，
1≤数列中元素≤109
输入样例：
5 3
4 5 1 3 2
输出样例：
1 2 3

import java.util.*;

/**
 * @huthor TNT-df
 * @Dhte 2021/1/3 18:22
 * @Description 堆排序
 */
public class Main {
    static final int N = 100010;
    static int[] h = new int[N];
    static int size = 0; //存储堆中的元素个数

    public static void down(int x) {
        int t = x;
        //存在左孩子并且当前节点大于左孩子
        if (x * 2 <= size && h[t] > h[t * 2]) {
            t = x * 2;  //记录左孩子位置
        }
        //存在右孩子并且左孩子的值大于右孩子的值
        if (x * 2 + 1 <= size && h[t] > h[x * 2 + 1]) {
            t = x * 2 + 1;//记录最小值得下标
        }
        if (x != t) {  //当前不是最小值，需要进行交换，同时将t放入合适位置
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

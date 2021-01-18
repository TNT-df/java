某校大门外长度为L的马路上有一排树，每两棵相邻的树之间的间隔都是1米。

我们可以把马路看成一个数轴，马路的一端在数轴0的位置，另一端在L的位置；数轴上的每个整数点，即0，1，2，……，L，都种有一棵树。

由于马路上有一些区域要用来建地铁。

这些区域用它们在数轴上的起始点和终止点表示。

已知任一区域的起始点和终止点的坐标都是整数，区域之间可能有重合的部分。

现在要把这些区域中的树（包括区域端点处的两棵树）移走。

你的任务是计算将这些树都移走后，马路上还有多少棵树。

输入格式
输入文件的第一行有两个整数L和M，L代表马路的长度，M代表区域的数目，L和M之间用一个空格隔开。

接下来的M行每行包含两个不同的整数，用一个空格隔开，表示一个区域的起始点和终止点的坐标。

输出格式
输出文件包括一行，这一行只包含一个整数，表示马路上剩余的树的数目。

数据范围
1≤L≤10000,
1≤M≤100
输入样例：
500 3
150 300
100 200
470 471
输出样例：
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
区间合并


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
        //r大于左端点值，说明有交集更新区间的右端点
        //否则说明当前区间没有交集
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


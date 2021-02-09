明明想在学校中请一些同学一起做一项问卷调查。

为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数，对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。

然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。

请你协助明明完成“去重”与“排序”的工作。

输入格式
输入文件包含2行，第1行为1个正整数，表示所生成的随机数的个数：N 。

第2行有N个用空格隔开的正整数，为所产生的随机数。

输出格式
输出文件也是2行，第1行为1个正整数M，表示不相同的随机数的个数。

第2行为M个用空格隔开的正整数，为从小到大排好序的不相同的随机数。

数据范围
1≤N≤100
输入样例：
10
20 40 32 67 40 20 89 300 400 15
输出样例：
8
15 20 32 40 67 89 300 400

import java.util.*;

public class Main {
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet <Integer> set = new HashSet<>();
        n = in.nextInt();
        int a[] = new int[n];
         for(int i = 0;i < n ;i++){
             a[i] = in.nextInt();
             set.add(a[i]);
         }
         System.out.println(set.size());
        Iterator<Integer> iterator = set.iterator();
        int re[] = new int[set.size()];
        int idx = 0;
        while(iterator.hasNext()){
            re[idx++] = iterator.next();
        }
        Arrays.sort(re);
      for(int temp : re)
          System.out.print(temp+" ");
    }
}

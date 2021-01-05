维护一个集合，支持如下几种操作：

“I x”，插入一个数x；
“Q x”，询问数x是否在集合中出现过；
现在要进行N次操作，对于每个询问操作输出对应的结果。

输入格式
第一行包含整数N，表示操作数量。

接下来N行，每行包含一个操作指令，操作指令为”I x”，”Q x”中的一种。

输出格式
对于每个询问指令“Q x”，输出一个询问结果，如果x在集合中出现过，则输出“Yes”，否则输出“No”。

每个结果占一行。

数据范围
1≤N≤105
−109≤x≤109
输入样例：
5
I 1
I 2
I 3
Q 2
Q 5
输出样例：
Yes
No



//拉链法
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author TNT-df
 * @Date 2021/1/4 12:14
 * @Description
 */
public class Main {
    static final int N = 100003;
    static int[] e = new int[N];
    static int[] ne = new int[N];
    static int[] h = new int[N];
    static int idx = 0;

    public static void insert(int x) {
        int k = (x % N + N) % N; //对负数进行散列表编号
        e[idx] = x;
        ne[idx] = h[k];
        h[k] = idx++;
    }

    public static boolean find(int x) {
        int k = (x % N + N) % N;
        for (int i = h[k]; i != -1; i = ne[i]) {
            if (e[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Arrays.fill(h, -1);
        while (n-- > 0) {
            String str = in.next();
            int x = in.nextInt();
            if (str.equals("I")) {
                insert(x);
            } else {
                if(find(x)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }

    }
}



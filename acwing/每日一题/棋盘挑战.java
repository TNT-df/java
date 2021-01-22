给定一个 N×N 的棋盘，请你在上面放置 N 个棋子，要求满足：

每行每列都恰好有一个棋子
每条对角线上都最多只能有一个棋子
    1   2   3   4   5   6
  -------------------------
1 |   | O |   |   |   |   |
  -------------------------
2 |   |   |   | O |   |   |
  -------------------------
3 |   |   |   |   |   | O |
  -------------------------
4 | O |   |   |   |   |   |
  -------------------------
5 |   |   | O |   |   |   |
  -------------------------
6 |   |   |   |   | O |   |
  -------------------------
上图给出了当 N=6 时的一种解决方案，该方案可用序列 2 4 6 1 3 5 来描述，该序列按顺序给出了从第一行到第六行，每一行摆放的棋子所在的列的位置。

请你编写一个程序，给定一个 N×N 的棋盘以及 N 个棋子，请你找出所有满足上述条件的棋子放置方案。

输入格式
共一行，一个整数 N。

输出格式
共四行，前三行每行输出一个整数序列，用来描述一种可行放置方案，序列中的第 i 个数表示第 i 行的棋子应该摆放的列的位置。

这三行描述的方案应该是整数序列字典序排在第一、第二、第三的方案。

第四行输出一个整数，表示可行放置方案的总数。

数据范围
6≤N≤13
输入样例：
6
输出样例：
2 4 6 1 3 5
3 6 2 5 1 4
4 1 5 2 6 3
4

public class Main{
    static int n;
    static int cout = 0;
    static boolean col[] = new boolean [15];
    static int path[] = new int[15];
    static boolean dg[] = new boolean [100];
    static boolean udg[] = new boolean[100];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        dfs(1);
        System.out.println(cout);
    }
    
    static void dfs(int x){
        if(x > n){
            cout ++;
            if(cout <= 3 ){
                for(int i = 1 ; i <= n ;i++ ){
                    System.out.print(path[i] + " ");
                }
                System.out.println();
            }
            return;
        }
        
        for(int i = 1 ; i <= n ;i++){
            
            if(!col[i] && !dg[x + i] && !udg[x-i + n]){
                 path[x] = i;
                 col[i]  = dg[x + i] = udg[x -i + n] = true;
                 dfs(x+1);
                 col[i] = dg[x + i] = udg[x - i + n] = false;
                 path[x] = 0;
            }
        }
        
    }
}
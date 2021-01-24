N 的阶乘（记作 N!）是指从 1 到 N（包括 1 和 N）的所有整数的乘积。

阶乘运算的结果往往都非常的大。

现在，给定数字 N，请你求出 N! 的最右边的非零数字是多少。

例如 5!=1×2×3×4×5=120，所以 5! 的最右边的非零数字是 2。

输入格式
共一行，包含一个整数 N。

输出格式
输出一个整数，表示 N! 的最右边的非零数字。

数据范围
1≤N≤1000
输入样例：
7
输出样例：
4
//末尾的0可由2和5乘积组成，分别计算2和5的个数，取最小值
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int res = 1,d2 = 0,d5 = 0;
        for(int i = 1;i <= n ;i ++){
            int x = i;
            while(x % 2 == 0) {
                x/=2;
                d2++;
            }
            while(x % 5 == 0){ 
                x/=5;
                d5++;
            }
            res=res* x %10; 
        }
        for(int i = 1 ;i <= d2 - d5;i ++) {
            res= (res*2)%10;
        }
    System.out.println(res );
    } 
}

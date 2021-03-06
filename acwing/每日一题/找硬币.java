伊娃喜欢从整个宇宙中收集硬币。

有一天，她去了一家宇宙购物中心购物，结账时可以使用各种硬币付款。

但是，有一个特殊的付款要求：每张帐单，她只能使用恰好两个硬币来准确的支付消费金额。

给定她拥有的所有硬币的面额，请你帮她确定对于给定的金额，她是否可以找到两个硬币来支付。

输入格式
第一行包含两个整数 N 和 M，分别表示硬币数量以及需要支付的金额。

第二行包含 N 个整数，表示每个硬币的面额。

输出格式
输出一行，包含两个整数 V1,V2，表示所选的两个硬币的面额，使得 V1≤V2 并且 V1+V2=M。

如果答案不唯一，则输出 V1 最小的解。

如果无解，则输出 No Solution。

数据范围
1≤N≤105,
1≤M≤1000
输入样例1：
8 15
1 2 8 7 2 4 11 15
输出样例1：
4 11
输入样例2：
7 14
1 8 7 2 4 11 15
输出样例2：
No Solution

/**
 * @Author TNT-df
 * @Date 2021/1/19 20:41
 * @Description 找硬币
 */
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M =in.nextInt();
        int[] a = new int[N];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < N;i++){
            a[i] = in.nextInt();
        }
        int cnt =0;
        for (int k: a) {
            if(!map.containsKey(k)){
                map.put(k,cnt);
                cnt++;
            }

        }
        int m=0, n=Integer.MIN_VALUE;
        for(int i = 0;i<a.length;i++){
            int j = M-a[i];
            if(map.containsKey(j)){
                if(j > n){
                    n = j;
                    m = a[i];
                }
                if(m>n){
                    int temp = m;
                    m = n;
                    n = temp;
                }
            }
        }
        if( n == Integer.MIN_VALUE)
            System.out.println("No Solution");
        else if(m==n &&map.get(m)!=1){
            System.out.println("No Solution");
        }
        else{
            System.out.println(m+" "+n);
        }
    }

}
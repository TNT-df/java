给定n个正整数ai，判定每个数是否是质数。

输入格式
第一行包含整数n。

接下来n行，每行包含一个正整数ai。

输出格式
共n行，其中第 i 行输出第 i 个正整数ai是否为质数，是则输出“Yes”，否则输出“No”。

数据范围
1≤n≤100,
1≤ai≤231−1
输入样例：
2
2
6
输出样例：
Yes
No
import java.util.*;

public class Main{
    static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2;i <= n /i;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n -- >0){
            int a = in.nextInt();
            if(isPrime(a))
            System.out.println("Yes");
            else System.out.println("No");
        }
    }
}

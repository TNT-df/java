���� V �ֻ��ң���λ��Ԫ����ÿ�ֻ���ʹ�õĴ������ޡ�

��ͬ����Ļ��ң���ֵ��������ͬ�ġ�

���ڣ�Ҫ������ V �ֻ��Ҵճ� N ԪǮ�����ʹ��ж����ֲ�ͬ�Ĵշ���

�����ʽ
��һ�а����������� V �� N��

�������������У���һ����� V ��������ÿ��������ʾһ�ֻ��ҵ���ֵ��

�����ʽ
���һ����������ʾ�����ܷ�������

���ݷ�Χ
1��V��25,
1��N��10000
�𰸱�֤��long long��Χ�ڡ�

����������
3 10
1 2 5
���������
10

### ��ά
```
import java.util.*;


public class Main{
    static final int N = 30;
    static final int M =10010;
    static long  dp[][] = new long [N][M];
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  
        int m = in.nextInt();
        dp[0][0] = 1;
        for(int i = 1;i <= n ;i++){
            int b =in.nextInt();
            for(int j = 0;j <= m;j++){
               dp[i][j] +=dp[i - 1][j];
               if(j >= b){
                   dp[i][j] +=dp[i][j - b];
               }
            }
        }
        System.out.print(dp[n][m]);
    }
}
```
### һά
```
import java.util.*;


public class Main{
    static final int N = 30;
    static final int M =10010;
    static long[] dp= new long[M];
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  
        int m = in.nextInt();
        dp[0] = 1;
        for(int i = 1;i <= n ;i++){
            int b =in.nextInt();
            for(int j = b;j <= m;j++){
               dp[j] =dp[j]+dp[j-b];
            }
        }
        System.out.print(dp[m]);
    }
}
```
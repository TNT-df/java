����һ������ͼ��ʾ�����������Σ��Ӷ�����������ÿһ������ѡ���ƶ��������·��Ľ����ƶ��������·��Ľ�㣬һֱ�ߵ��ײ㣬Ҫ���ҳ�һ��·����ʹ·���ϵ����ֵĺ����

        7
      3   8
    8   1   0
  2   7   4   4
4   5   2   6   5
�����ʽ
��һ�а�������n����ʾ���������εĲ�����

������n�У�ÿ�а����������������е� i �б�ʾ���������ε� i �������������

�����ʽ
���һ����������ʾ����·�����ֺ͡�

���ݷ�Χ
1��n��500,
10000���������е�������10000
����������
5
7
3 8
8 1 0 
2 7 4 4
4 5 2 6 5
���������
30

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        int[][] dp = new int[n][n];
        for(int i = 0;i < n;i ++){
            for(int j = 0;j <=i;j++){
                a[i][j] = in.nextInt();
            }
        }
        dp[0][0] = a[0][0];
        for(int i = 1;i < n;i++){
            for(int j = 0;j <= i;j++){
                if(j == 0){
                    dp[i][j] =dp[i-1][j]+a[i][j];
                }else if(i == j){
                    dp[i][j] =a[i][j]+dp[i-1][j-1];
                }
                else dp[i][j] =Math.max(a[i][j]+dp[i-1][j],a[i][j]+dp[i-1][j-1]);
            }
        }
        int max=0;
     for(int j=0;j<n;j++){
         max = Math.max(dp[n-1][j],max);
     }
        System.out.print(max);
    }
}
����һ��n��m�е���������������q��ѯ�ʣ�ÿ��ѯ�ʰ����ĸ�����x1, y1, x2, y2����ʾһ���Ӿ�������Ͻ���������½����ꡣ

����ÿ��ѯ������Ӿ������������ĺ͡�

�����ʽ
��һ�а�����������n��m��q��

������n�У�ÿ�а���m����������ʾ��������

������q�У�ÿ�а����ĸ�����x1, y1, x2, y2����ʾһ��ѯ�ʡ�

�����ʽ
��q�У�ÿ�����һ��ѯ�ʵĽ����

���ݷ�Χ
1��n,m��1000,
1��q��200000,
1��x1��x2��n,
1��y1��y2��m,
1000�ܾ�����Ԫ�ص�ֵ��1000
����������
3 4 3
1 7 2 4
3 6 2 8
2 1 2 3
1 1 2 2
2 1 3 4
1 3 3 4
���������
17
27
21
import java.lang.*;
import java.util.*;
public class Main{
    
    public static void main(String[] args){
        final int  N = 1001;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
         int m = input.nextInt();
         int q = input.nextInt();
        int[][] a = new int [N][N];
         int[][] s = new int [N][N];
         for(int i = 1;i <= n;i ++){
             for(int j = 1;j <=m;j++){
                 a[i][j] = input.nextInt();
             }
         }
          for(int i = 1;i <= n;i ++){
             for(int j = 1;j <=m;j++){
                 s[i][j] = s[i-1][j]+s[i][j-1]-s[i-1][j-1]+a[i][j];
             }
         }
         while(q-->0){
          int x1 = input.nextInt();
          int y1 = input.nextInt();
          int x2 = input.nextInt();
          int y2 = input.nextInt();
          System.out.println(s[x2][y2]-s[x1-1][y2]-s[x2][y1-1]+s[x1-1][y1-1]);
         }
    }
}
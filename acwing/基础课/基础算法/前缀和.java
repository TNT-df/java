
����һ������Ϊn���������С�

������������m��ѯ�ʣ�ÿ��ѯ������һ��l, r��

����ÿ��ѯ�ʣ����ԭ�����дӵ�l��������r�����ĺ͡�

�����ʽ
��һ�а�����������n��m��

�ڶ��а���n����������ʾ�������С�

������m�У�ÿ�а�����������l��r����ʾһ��ѯ�ʵ����䷶Χ��

�����ʽ
��m�У�ÿ�����һ��ѯ�ʵĽ����

���ݷ�Χ
1��l��r��n,
1��n,m��100000,
1000��������Ԫ�ص�ֵ��1000
����������
5 3
2 1 3 6 4
1 2
1 3
2 4
���������
3
6
10
import java.util.*;
public class Main{
    private static int N = 100010;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] a = new int [N];
        for(int i = 1;i <= n;i++){
            a[i] = input.nextInt();
        }
        
        int [] presum = new int[N];
        presum[0] =0;
        for(int i =1;i<=n;i++){
            presum[i] =presum[i-1]+a[i];
        }
        while(m-->0){
         int x = input.nextInt();
         int y = input.nextInt();
         System.out.println(presum[y]-presum[x-1]);
        
        }
    } 
}
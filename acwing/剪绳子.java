��N�����ӣ���i�����ӳ���ΪLi��������ҪM���ȳ������ӣ�����Զ�N�����ӽ�������ü�������ƴ�ӣ��������æ�������M��������ĳ����Ƕ��١�

�����ʽ
��һ�а���2��������N��M����ʾԭʼ���ӵ��������������ӵ�������

�ڶ��а���N�����������е� i ������Li��ʾ�� i �����ӵĳ��ȡ�

�����ʽ
���һ�����֣���ʾ�ü�����ĳ��ȣ�������λС����

���ݷ�Χ
1��N,M��100000,
0<Li<109
����������
3 4
3 5 4
���������
2.50
��������
��һ���͵������ֱ�ü���һ��2.50
���ȵ����ӣ��ڶ�������2��2.50���ȵ����ӣ��պ�4����
//�� 0-1e9 �������Ž⣨���֣�;
import java.util.Scanner;
public class Main{
    static int n;
    static int m;
    static int [] a= new int[100_110];
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for(int i = 0;i < n;i ++)
        a[i] = in.nextInt();
        double l = 0,r = 1e9;
        while(r - l> 1e - 4){
            double mid = (l + r) /2;
            if(check(mid))
            l = mid;
            else
            r = mid;
        }
        System.out.printf("%.2f",r);
    }
    public static boolean check(double mid){
        int cnt =0;
        for(int i = 0; < n;i ++){
            cnt += a[i] / mid;
        }
        return cnt >= m;  
    }
}
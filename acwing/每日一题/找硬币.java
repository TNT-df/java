����ϲ���������������ռ�Ӳ�ҡ�

��һ�죬��ȥ��һ�����湺�����Ĺ������ʱ����ʹ�ø���Ӳ�Ҹ��

���ǣ���һ������ĸ���Ҫ��ÿ���ʵ�����ֻ��ʹ��ǡ������Ӳ����׼ȷ��֧�����ѽ�

������ӵ�е�����Ӳ�ҵ����������ȷ�����ڸ����Ľ����Ƿ�����ҵ�����Ӳ����֧����

�����ʽ
��һ�а����������� N �� M���ֱ��ʾӲ�������Լ���Ҫ֧���Ľ�

�ڶ��а��� N ����������ʾÿ��Ӳ�ҵ���

�����ʽ
���һ�У������������� V1,V2����ʾ��ѡ������Ӳ�ҵ���ʹ�� V1��V2 ���� V1+V2=M��

����𰸲�Ψһ������� V1 ��С�Ľ⡣

����޽⣬����� No Solution��

���ݷ�Χ
1��N��105,
1��M��1000
��������1��
8 15
1 2 8 7 2 4 11 15
�������1��
4 11
��������2��
7 14
1 8 7 2 4 11 15
�������2��
No Solution

/**
 * @Author TNT-df
 * @Date 2021/1/19 20:41
 * @Description ��Ӳ��
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
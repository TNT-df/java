��������N�����һ��N�׵Ķ�ά���顣

�������ʽ����������

�����ʽ
����������У�ÿ�а���һ������N��

��������ΪN=0ʱ����ʾ����������Ҹ����������κδ���

�����ʽ
����ÿ����������N�����һ������Ҫ���N�׶�ά���顣

ÿ������ռN�У�ÿ�а���N���ÿո������������

ÿ�����������Ϻ����һ�����С�

���ݷ�Χ
0��N��100
����������
1
2
3
4
5
0
���������
1

1 2
2 1

1 2 3
2 1 2
3 2 1

1 2 3 4
2 1 2 3
3 2 1 2
4 3 2 1

1 2 3 4 5
2 1 2 3 4
3 2 1 2 3
4 3 2 1 2
5 4 3 2 1


import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(true){
            int n = in.nextInt();
            if(n == 0) break;
            int a[][] = new int[n][n];
            for(int i = 0;i < n;i ++){
                for(int j = 0;j < n;j ++){
                    if(i == j) a[i][j] = 1;
                    else a[i][j] = Math.abs(i-j)+1;
                }
            }
            for(int []k:a){
                for(int m :k){
                    System.out.print(m+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
������ٯ��һֻ�����������С���������ó��ľ����߸��ָ������Թ���

������Ҫ��սһ���ǳ�����Թ����о�Ա��Ϊ�˹���������ٯ���쵽���յ㣬�����յ����һ�鰢����ٯ��ϲ�������ҡ�

�����о�Ա����֪�������������ٯ�㹻��������������Ҫ����ʱ����ܳԵ����ҡ�

�Թ���һ�� R��C ���ַ���������ʾ��

�ַ� S ��ʾ������ٯ���ڵ�λ�ã��ַ� E ��ʾ�������ڵ�λ�ã��ַ� # ��ʾǽ�ڣ��ַ� . ��ʾ����ͨ�С�

������ٯ�� 1 ����λʱ���ڿ��Դӵ�ǰ��λ���ߵ������������ĸ������ϵ�����һ��λ�ã��������߳���ͼ�߽硣

�����ʽ
��һ����һ�������� T����ʾһ���� T �����ݡ�

ÿһ�����ݵĵ�һ�а����������ÿո�ֿ��������� R �� C����ʾ��ͼ��һ�� R��C �ľ���

�������� R �������˵�ͼ�ľ������ݣ�ÿһ�а����� C ���ַ����ַ���������Ŀ��������������֤���ҽ���һ�� S �� E��

�����ʽ
����ÿһ�����ݣ����������ٯ�Ե����ҵ����ٵ�λʱ�䡣

��������ٯ�޷��Ե����ң��������oop!����ֻ���������������ݣ���������ţ���

ÿ�����ݵ�������ռһ�С�

���ݷ�Χ
1<T��10,
2��R,C��200
����������
3
3 4
.S..
###.
..E.
3 4
.S..
.E..
....
3 4
.S..
####
..E.
���������
5
1
oop!

import java.util.*;

public class Main{
    static final int N =210;
    static int n;
    static int m;
    static char [][] ch = new char[N][N];
    static int [][] w = new int[N][N];

    static void bfs(int x,int y){
        for(int [] temp :w){
        Arrays.fill(temp,0);
        }
         int[] dx= {-1,0,1,0};
         int[] dy = {0,1,0,-1};
      Queue<int[]> q = new LinkedList<>();
      q.offer(new int []{x,y});
      w[x][y] = 0;
      while(!q.isEmpty()){
           int [] temp = q.poll();
            int t1 = temp[0];
            int t2 = temp[1];
          for(int i = 0 ;i < 4;i++ ){
             int a = t1+dx[i];
             int b = t2+dy[i];
             if(a >= 0 && a<n&&b>=0&&b<m&&ch[a][b] !='#'&&w[a][b]==0){
                 q.offer(new int[]{a,b});
                 w[a][b] =w[t1][t2]+1;
                 if(ch[a][b] == 'E'){
                  System.out.println(w[a][b]); 
                  return ;
             } 
             }

          }
      }

        System.out.println("oop!");

    }
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
       int T = in.nextInt();
       while( T-- >0){
           n = in.nextInt();
           m = in.nextInt();
            int x= 0 ,y = 0;
           for(int i = 0; i < n ;i++){
               String  str =  in.next();
               for(int j = 0;j < m ;j++){
                  ch[i][j] = str.charAt(j);
                  if(ch[i][j] == 'S'){
                      x = i;
                      y = j;
                  }
               }
           }
           bfs(x,y);
       }
    }
}

��һ�䳤���εķ��ӣ��������˺�ɫ����ɫ������ɫ�������δ�ש��

��վ������һ���ɫ�Ĵ�ש�ϣ�ֻ�������ڣ����������ĸ����򣩵ĺ�ɫ��ש�ƶ���

��дһ�����򣬼������ܹ��ܹ�������ٿ��ɫ�Ĵ�ש��

�����ʽ
�������������ݼ��ϡ�

ÿ�����ݼ��ϵĵ�һ������������ W �� H���ֱ��ʾ x ����� y �����ש��������

�ڽ������� H ���У�ÿ�а��� W ���ַ���ÿ���ַ���ʾһ���ש����ɫ����������

1����.������ɫ�Ĵ�ש��
2����#������ɫ�Ĵ�ש��
3����@������ɫ�Ĵ�ש��������վ������ש�ϡ����ַ���ÿ�����ݼ�����Ψһ����һ�Ρ�

����һ���ж������������ʱ����ʾ���������

�����ʽ
��ÿ�����ݼ��ϣ��ֱ����һ�У���ʾ��ӳ�ʼλ�ó����ܵ���Ĵ�ש��(����ʱ������ʼλ�õĴ�ש)��

���ݷ�Χ
1��W,H��20
����������
6 9 
....#. 
.....# 
...... 
...... 
...... 
...... 
...... 
#@...# 
.#..#. 
0 0
���������
45

import java.io.*;
import java.util.Scanner;


/**
 * @Author TNT-df
 * @Date 2021/1/12 12:42
 * @Description �����
 */

public class Main {
    static int n=0;
    static int m=0;
    static int m1=0;
    static int n1=0;
    static char a[][] = new char[25][25];
    static int[] z = {-1, 0, 1, 0};
    static int[] j = {0, 1, 0, -1};
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        while (true) {
            String[] str = reader.readLine().split(" ");

            m = Integer.parseInt(str[1]);
            n = Integer.parseInt(str[0]);
            if (m == 0 && n == 0) {
                break;
            }
            m1 = m;
            n1 =n;
            boolean b[][] = new boolean[m][n];
            int x = 0, y = 0;
            for (int i = 0; i < m; i++) {
                String s = reader.readLine();
                for (int j = 0; j < n; j++) {
                    a[i][j] = s.charAt(j);
                    if (a[i][j] == '@') {
                        x = i;
                        y = j;
                    }
                }
            }
            System.out.println(dfs(x, y, b));
        }


    }
    public static int dfs(int x, int y, boolean[][] b) {

      if(x<0||x>=m1||y<0||y>=n1){
          return 0;
      }
      if(b[x][y] ||a[x][y] =='#'){
          return 0;
      }
      b[x][y] = true;
      return 1+dfs(x+1,y,b)+dfs(x-1,y,b)+dfs(x,y-1,b)+dfs(x,y+1,b);
    }

}

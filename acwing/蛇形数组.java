������������n��m�����һ��n��m�еľ��󣬽����� 1 �� n*m ���ջ�����������������С�

���������ʽ�ɲο�������

�����ʽ
���빲һ�У�������������n��m��

�����ʽ
�������Ҫ��ľ���

����ռn�У�ÿ�а���m���ո������������

���ݷ�Χ
1��n,m��100
����������
3 3
���������
1 2 3
8 9 4
7 6 5

import java.util.Scanner;

/**
 * @Author TNT-df
 * @Date 2021/1/11 22:05
 * @Description ���ξ���
 */
public class Main {
    static int[][] a = new int[500][500];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int m = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                a[i][j] = -1;
            }
        }

        int count = n * m;
        int x = 1, y = 1;
        int cnt = 1;
        while (cnt <= count) {

            while (a[x][y] == -1 &&y <= m ) {
                a[x][y++] = cnt;
                cnt++;
            }
            y--;
            x++;
            while (  a[x][y] == -1&&x <= n) {
                a[x++][y] = cnt;
                cnt++;
            }
            x--;
            y--;
            while (a[x][y] == -1&& y >= 1 ) {
                a[x][y--] = cnt;
                cnt++;
            }
            x--;
            y++;
            while ( a[x][y] == -1&&x >= 1 ) {
                a[x--][y] = cnt;
                cnt++;
            }
            x++;
            y++;

        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

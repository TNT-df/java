����һ��n*m�Ķ�ά�������飬������ʾһ���Թ���������ֻ����0��1������0��ʾ�����ߵ�·��1��ʾ����ͨ����ǽ�ڡ�

�������һ����λ�����Ͻ�(1, 1)������֪����ÿ�ο������ϡ��¡���������һ�������ƶ�һ��λ�á�

���ʣ����˴����Ͻ��ƶ������½�(n, m)����������Ҫ�ƶ����ٴΡ�

���ݱ�֤(1, 1)����(n, m)��������Ϊ0����һ�����ٴ���һ��ͨ·��

�����ʽ
��һ�а�����������n��m��

������n�У�ÿ�а���m��������0��1������ʾ�����Ķ�ά�����Թ���

�����ʽ
���һ����������ʾ�����Ͻ��ƶ������½ǵ������ƶ�������

���ݷ�Χ
1��n,m��100
����������
5 5
0 1 0 0 0
0 1 0 1 0
0 0 0 0 0
0 1 1 1 0
0 0 0 1 0
���������
8
import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[][] a = new int[110][110];
    static int[][] b = new int[110][110];
    static int tt = -1;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         n = in.nextInt();
         m = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = -1;
            }
        }
        b[0][0] = 0;
        bfs();
        System.out.println(b[n - 1][m - 1]);
    }

    static void bfs() {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0});
        while (!queue.isEmpty()) {
            int t[] = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = t[0] + dx[i];
                int y = t[1] + dy[i];
                if (x >= 0 && x < n && y >= 0 && y <= m && b[x][y] == -1 && a[x][y] == 0) {
                    b[x][y] = b[t[0]][t[1]] + 1;
                    queue.offer(new int[]{x, y});
                }
            }
        }
    }
}


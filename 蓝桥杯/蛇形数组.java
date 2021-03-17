package 蓝桥杯112;

public class class03 {
	public static void main(String[] args) {
		int a[][] = new int[81][81];
		int res = 1;
      // i为横纵坐标之和
		for (int i = 2; i <= 80 * 2; i++) {
			if (i % 2 == 1) {
				for (int j = 1; j < i; j++) {
					if (j >= 1 && j <= 80 && i - j <= 80 && i - j >= 1) {
						a[j][i - j] = res++;
					}
				}
			} else {
				for (int j = i - 1; j >= 1; j--) {
					if (j >= 1 && j <= 80 && i - j >= 1 && i - j <= 80) {
						a[j][i - j] = res++;
					}
				}
			}
		}
		System.out.println(a[20][20]);
	}
}

��������ָ���ִ�ǰ������ʹӺ���ǰ������ͬ�����֡�

�������� 12321 ���ǵ��͵Ļ������֡�

���ڸ�����һ������ B�������ж� 1��300 ֮������������У�����Щ������ƽ��ת��Ϊ B ���ƺ��� B ���Ʊ�ʾ�ǻ������֡�

�����ʽ
һ������ B��

�����ʽ
ÿ�а��������� B �����±�ʾ�����֡�

��һ����ʾ����ƽ��ֵת��Ϊ B ���ƺ��ǻ��������Ǹ������ڶ�������ʾ��һ������ƽ����

�����������������ְ���С����˳�����������

���ݷ�Χ
2��B��20,
���ڴ��� 9 �����֣��� A ��ʾ 10���� B ��ʾ 11���Դ����ơ�

����������
10
���������
1 1
2 4
3 9
11 121
22 484
26 676
101 10201
111 12321
121 14641
202 40804
212 44944
264 69696

/*
��ת�������ٽ����ж�
*/
import java.util.Scanner;

/**
 * @Author TNT-df
 * @Date 2021/1/13 18:22
 * @Description
 */
public class Main {
    static int b;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         b = in.nextInt();
        for (int i = 1; i <= 300; i++) {
            String st = convert(i * i);
            if (checked(st)) {
                System.out.println(convert(i) + " " + convert(i * i));
            }
        }
    }

    static String convert(int x) {
        String str = "0123456789ABCDEFGHIJ";
        StringBuffer sb = new StringBuffer();

        while (x > 0) {
           int mod = x % b;
            x = x / b;
            sb.append(str.charAt(mod));
        }
        sb.reverse();
        return sb.toString();
    }

    static boolean checked(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

}

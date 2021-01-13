
/*
1将一个10进制数转为b进制数
2.将b进制数转为10进制
*/
import java.util.Scanner;

public class Demo {
    public static char get(int x) {
        if (x <= 9) {
            return (char) (x + '0');
        } else {
            return (char) (x + 'A' - 10);
        }
    }

    public static String convertToB(int x, int b) {
        StringBuffer sb = new StringBuffer();
        while (x > 0) {
            int mod = x % b;
            x /= b;
            sb.append(get(mod));
        }
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int x = in.nextInt();
        System.out.println(convertToB(x, b));
        System.out.println(convertTo10(convertToB(x,b),b));
    }

    static int convertTo10(String str, int b) {
        int ret = 0;
        for (int i = 0; i < str.length(); i++) {
            ret = ret * b + getInt(str.charAt(i));
        }
        return ret;
    }

    static int getInt(char a) {
        if(a>='0'&&a<='9'){
            return a-'0';
        }else{
            return a-'A'+10;
        }
    }
}
package 蓝桥杯112;

import java.util.Scanner;


public class class07 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        int a[] = new int[26];
        char[] ch = string.toCharArray();
        for(int i = 0;i<ch.length;i++) {
        	a[ch[i]-'a']++;
        }
        int idx=-1, max =0;
        for(int i = 0;i<=25;i++) {
        	if(a[i]>max) {
        		idx = i;
        		max = Math.max(max, a[i]);
        	}
        }
        System.out.println((char)('a'+idx));
        System.out.println(max);
	}

}

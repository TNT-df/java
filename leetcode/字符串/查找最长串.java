在一个由小写英文字母(a-z)组成的字符串中，查找最长子串，
其头尾字母相同，且中间不包含该头尾字母，并输出最左边的该类子串。
输入说明:待处理字串(长度≤200)
输出说明:子串
输入样例: adfasjdoiasldhlfa
输出样例: fasjdoiasldhlf

package df.tnt.oo;
	
import java.util.Scanner;

public class test3 {
  public static void main(String[] args) {
	  Scanner in =new Scanner(System.in);
	  String str = in.next();
	 char[] ch = str.toCharArray();
	 int left=0;//起始位置
	 int len=0;//记录最长子串的长度
	for(int i = 0;i<ch.length;i++) {
		int right =i+1;
		while(right < ch.length && ch[right]!=ch[i]) { //找子串的末位置 
			right++;
		}
		if(right == ch.length) continue;
		if(right-i+1>len) {            //更新子串长度和起始位置
			len  = right-i+1;
			left = i;
		}		
	}
	System.out.println(str.substring(left,len+left)); //获得结果
  }	 
  }


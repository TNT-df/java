��һ����СдӢ����ĸ(a-z)��ɵ��ַ����У�������Ӵ���
��ͷβ��ĸ��ͬ�����м䲻������ͷβ��ĸ�����������ߵĸ����Ӵ���
����˵��:�������ִ�(���ȡ�200)
���˵��:�Ӵ�
��������: adfasjdoiasldhlfa
�������: fasjdoiasldhlf

package df.tnt.oo;
	
import java.util.Scanner;

public class test3 {
  public static void main(String[] args) {
	  Scanner in =new Scanner(System.in);
	  String str = in.next();
	 char[] ch = str.toCharArray();
	 int left=0;//��ʼλ��
	 int len=0;//��¼��Ӵ��ĳ���
	for(int i = 0;i<ch.length;i++) {
		int right =i+1;
		while(right < ch.length && ch[right]!=ch[i]) { //���Ӵ���ĩλ�� 
			right++;
		}
		if(right == ch.length) continue;
		if(right-i+1>len) {            //�����Ӵ����Ⱥ���ʼλ��
			len  = right-i+1;
			left = i;
		}		
	}
	System.out.println(str.substring(left,len+left)); //��ý��
  }	 
  }


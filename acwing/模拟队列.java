ʵ��һ�����У����г�ʼΪ�գ�֧�����ֲ�����

(1) ��push x�� �C ���β����һ����x��

(2) ��pop�� �C �Ӷ�ͷ����һ������

(3) ��empty�� �C �ж϶����Ƿ�Ϊ�գ�

(4) ��query�� �C ��ѯ��ͷԪ�ء�

����Ҫ�Զ��н���M�����������е�ÿ������3�Ͳ���4��Ҫ�����Ӧ�Ľ����

�����ʽ
��һ�а�������M����ʾ����������

������M�У�ÿ�а���һ�����������������Ϊ��push x������pop������empty������query���е�һ�֡�

�����ʽ
����ÿ����empty���͡�query��������Ҫ���һ����ѯ�����ÿ�����ռһ�С�

���У���empty�������Ĳ�ѯ���Ϊ��YES����NO������query�������Ĳ�ѯ���Ϊһ����������ʾ��ͷԪ�ص�ֵ��

���ݷ�Χ
1��M��100000,
1��x��109,
���в�����֤�Ϸ���

����������
10
push 6
empty
query
pop
empty
push 3
push 4
pop
query
push 6
���������
NO
6
YES
4
import java.util.*;
public class Main{
	 static int head = 0;
	 static int tail=0;
	 static int [] a = new int[100010]; 
	 static void push(int x) {
		 a[tail++] = x;
	 }
	 static void pop() {
		 head++;		 
	 }
	 static void isEmpty() {
		 if(head ==tail) {
			 System.out.println("YES");
		 }else {
			 System.out.println("NO");
		 }
	 }
	 static void query() {
		 System.out.println(a[head]);
	 }
	 public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		int m = input.nextInt();
		while(m-->0) {
			String str = input.next();
			if(str.equals("push")) {
				int x = input.nextInt();
			    push(x);	
			}else if(str.equals("pop")) {
				pop();
			}else if(str.equals("empty")) {
				isEmpty();
			}else {
				query();
			}
		}
	}
 }
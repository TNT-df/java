ʵ��һ��˫����˫�����ʼΪ�գ�֧��5�ֲ�����

(1) ����������һ������

(2) �����Ҳ����һ������

(3) ����k���������ɾ����

(4) �ڵ�k���������������һ������

(5) �ڵ�k����������Ҳ����һ����

����Ҫ�Ը��������M�β��������������в����󣬴����������������

ע��:��Ŀ�е�k���������������ָ��ǰ����ĵ�k�������������������һ��������n���������ղ����ʱ��˳����n��������Ϊ����1�������������2���������������n�����������

�����ʽ
��һ�а�������M����ʾ����������

������M�У�ÿ�а���һ��������������������Ϊ���¼��֣�

(1) ��L x������ʾ�����������˲�����x��

(2) ��R x������ʾ����������Ҷ˲�����x��

(3) ��D k������ʾ����k���������ɾ����

(4) ��IL k x������ʾ�ڵ�k���������������һ������

(5) ��IR k x������ʾ�ڵ�k����������Ҳ����һ������

�����ʽ
��һ�У���������������������

���ݷ�Χ
1��M��100000
���в�����֤�Ϸ���

����������
10
R 7
D 1
L 3
IL 2 10
D 3
IL 2 7
L 8
R 9
IL 4 7
IR 2 2
���������
8 7 7 3 2 9

import java.util.*;


public class Main{
	static int[] e = new int [100010];
	static int[] l = new int[100010];
	static int[] r = new int[100010];
	static int index = 0;
	//��ʼ��
	static void init() {
	   r[0] = 1; //ͷ
	   l[1] = 0; //β
		index=2; // 0��1�ڵ��ѱ�ռ��
	}
	static void add(int k,int x) {
		e[index] = x;
		l[index] =k; //��ǰ�ڵ����ָ��ָ��k
		r[index] = r[k];//��ǰ�ڵ����ָ��ָ��k���ҽ��
		l[r[k]] =index;//k����ָ��ָ�������ָ��ָ��index;
		r[k] =index; //k����ָ��ָ��index
		index++;
	}
	static void delete(int k) {
		r[l[k]] = r[k]; //k�ڵ����ָ��ָ��Ľ��ָ��k���ҽ��
		l[r[k]] = l[k]; //k������ָ��ָ��Ľ��ָ��k����ڵ�
	}
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 int m = input.nextInt();
	 init();
	 while(m-->0) {
		 String string = input.next();
		 if(string.equals("R")) {
			 int x = input.nextInt();
			 add(l[1],x);
		 }else if (string.equals("D")) {
			 int k =input.nextInt();
			delete(k+1);
		}else if(string.equals("L")) {
			int x = input.nextInt();
			add(0,x);
		}else if(string.equals("IR")) {
			int k =input.nextInt();
			int x = input.nextInt();
			add(k+1, x);
		}
		  else {
			int k =input.nextInt();
			int x = input.nextInt();
			add(l[k+1], x);
		}
	 }
		for(int i = r[0];i!=1;i=r[i]) {
			System.out.print(e[i]+" ");
		}
	}
}

```

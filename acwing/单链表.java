ʵ��һ�������������ʼΪ�գ�֧�����ֲ�����

(1) ������ͷ����һ������

(2) ɾ����k������������������

(3) �ڵ�k��������������һ����

����Ҫ�Ը��������M�β��������������в����󣬴�ͷ��β�����������

ע��:��Ŀ�е�k���������������ָ��ǰ����ĵ�k�������������������һ��������n���������ղ����ʱ��˳����n��������Ϊ����1�������������2���������������n�����������

�����ʽ
��һ�а�������M����ʾ����������

������M�У�ÿ�а���һ��������������������Ϊ���¼��֣�

(1) ��H x������ʾ������ͷ����һ����x��

(2) ��D k������ʾɾ����k��������������������kΪ0ʱ����ʾɾ��ͷ��㣩��

(3) ��I k x������ʾ�ڵ�k����������������һ����x���˲�����k������0����

�����ʽ
��һ�У������������ͷ��β�����

���ݷ�Χ
1��M��100000
���в�����֤�Ϸ���

����������
10
H 9
I 1 1
D 1
D 0
H 6
I 3 6
I 4 5
I 4 5
I 3 4
D 6
���������
6 4 6 5
import java.util.*;

public class Main{
    private static int N = 100010;
    private static int[] e = new int[N];
    private static int[] ne = new int[N];
    //ͷ�ڵ�ָ��
    private static int hh;
    //��һ���ڵ�λ��
    private static int idx;

    //��ʼ����1������ڵ��±�Ϊ0�����Բ�����k����ʱ��Ҫ-1 ����
    public static void init(){
        //ͷ�ڵ�ָ���
        hh = -1;
        idx = 0;
    }
    //�嵽ͷ�ڵ��
    public static void insertH(int x){
        e[idx] = x;
        ne[idx] = hh;
        hh = idx++;
    }
    //�嵽��k���ڵ��
    public static void insertK(int k,int x){
        e[idx] = x;
        ne[idx] = ne[k];
        ne[k] = idx++;
    }
    //ɾ����k�����������
    public static void delete(int k){
        ne[k] = ne[ne[k]];
    }
    public static void main(String[] args){
        //�������ȳ�ʼ�������������ӡ��ʱ
        init();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        while(m-- > 0){
            String op = scanner.next();
            if("H".equals(op)){
                int x =scanner.nextInt();
                insertH(x);
            }else if("D".equals(op)){
                int k =scanner.nextInt();
                if(k == 0){
                    //��kΪ0ʱ��ɾ��ͷ��㣬�����������
                    hh = ne[hh];
                }else{
                    delete(k - 1);
                }
            }else if("I".equals(op)){
                //k��x����λ�ò�Ҫд������
                int k =scanner.nextInt();
                int x =scanner.nextInt();
                insertK(k - 1,x);
            }
        }

        for(int i = hh;i != -1;i = ne[i]){
            System.out.print(e[i] + " ");
        }
    }
}

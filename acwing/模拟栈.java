ʵ��һ��ջ��ջ��ʼΪ�գ�֧�����ֲ�����

(1) ��push x�� �C ��ջ������һ����x��

(2) ��pop�� �C ��ջ������һ������

(3) ��empty�� �C �ж�ջ�Ƿ�Ϊ�գ�

(4) ��query�� �C ��ѯջ��Ԫ�ء�

����Ҫ��ջ����M�����������е�ÿ������3�Ͳ���4��Ҫ�����Ӧ�Ľ����

�����ʽ
��һ�а�������M����ʾ����������

������M�У�ÿ�а���һ�����������������Ϊ��push x������pop������empty������query���е�һ�֡�

�����ʽ
����ÿ����empty���͡�query��������Ҫ���һ����ѯ�����ÿ�����ռһ�С�

���У���empty�������Ĳ�ѯ���Ϊ��YES����NO������query�������Ĳ�ѯ���Ϊһ����������ʾջ��Ԫ�ص�ֵ��

���ݷ�Χ
1��M��100000,
1��x��109
���в�����֤�Ϸ���

����������
10
push 5
query
push 6
pop
query
pop
empty
push 4
query
empty
���������
5
5
YES
4
NO
import java.util.*;
public class Main{
    static int[] st = new int [100010];
    static int top = -1;
    public static void isEmpty(){
        if(top < 0)
        System.out.println("YES");
        else{
            System.out.println("NO");
        }
    }
    public static void push(int x){
        st[++top] =x;
    }
    public static void pop(){
           top--;
    }
    public static void query(){
            System.out.println(st[top]);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int m = input.nextInt();
        
        while(m-- > 0){
            String str = input.next();
            if(str.equals("push")){
                int x = input.nextInt();
                push(x);
            }else if(str.equals("pop")){
                pop();
            }else if(str.equals("empty")){
                isEmpty();
            }else{
                query();
            }
        }
    }
}
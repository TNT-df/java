����һ������ΪN���������У����ÿ������ߵ�һ������С��������������������-1��

�����ʽ
��һ�а�������N����ʾ���г��ȡ�

�ڶ��а���N����������ʾ�������С�

�����ʽ
��һ�У�����N�����������е�i������ʾ��i��������ߵ�һ������С��������������������-1��

���ݷ�Χ
1��N��105
1��������Ԫ�ء�109
����������
5
3 4 2 7 5
���������
-1 3 -1 2 2
import java.util.*;
public class Main{
    static final int N = 100010;
    static int[] a= new int[N];
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0;i < n;i++){
            a[i]=input.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<n;i++){
           while(!stack.isEmpty()&&a[i]<=stack.peek()){ //��ջ��Ϊ�ղ���ջ��Ԫ�ش��ڵ�ǰԪ�أ�����ջ��Ԫ��
               stack.pop();
           }
           if(stack.isEmpty()||stack.peek()>a[i])//���ջΪ��ջ��Ԫ�ش��ڵ�ǰԪ��
           System.out.print(-1+" ");  //���-1
        else{
            System.out.print(stack.peek()+" ");//�������ջ��Ԫ��
        }
        stack.push(a[i]); //����ǰԪ�ؽ���ѹջ
        }
    }
}


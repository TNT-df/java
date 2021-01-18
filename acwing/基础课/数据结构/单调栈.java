给定一个长度为N的整数数列，输出每个数左边第一个比它小的数，如果不存在则输出-1。

输入格式
第一行包含整数N，表示数列长度。

第二行包含N个整数，表示整数数列。

输出格式
共一行，包含N个整数，其中第i个数表示第i个数的左边第一个比它小的数，如果不存在则输出-1。

数据范围
1≤N≤105
1≤数列中元素≤109
输入样例：
5
3 4 2 7 5
输出样例：
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
           while(!stack.isEmpty()&&a[i]<=stack.peek()){ //当栈不为空并且栈顶元素大于当前元素，弹出栈顶元素
               stack.pop();
           }
           if(stack.isEmpty()||stack.peek()>a[i])//如果栈为或栈顶元素大于当前元素
           System.out.print(-1+" ");  //输出-1
        else{
            System.out.print(stack.peek()+" ");//否则输出栈顶元素
        }
        stack.push(a[i]); //将当前元素进行压栈
        }
    }
}


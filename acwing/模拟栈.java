实现一个栈，栈初始为空，支持四种操作：

(1) “push x” – 向栈顶插入一个数x；

(2) “pop” – 从栈顶弹出一个数；

(3) “empty” – 判断栈是否为空；

(4) “query” – 查询栈顶元素。

现在要对栈进行M个操作，其中的每个操作3和操作4都要输出相应的结果。

输入格式
第一行包含整数M，表示操作次数。

接下来M行，每行包含一个操作命令，操作命令为”push x”，”pop”，”empty”，”query”中的一种。

输出格式
对于每个”empty”和”query”操作都要输出一个查询结果，每个结果占一行。

其中，”empty”操作的查询结果为“YES”或“NO”，”query”操作的查询结果为一个整数，表示栈顶元素的值。

数据范围
1≤M≤100000,
1≤x≤109
所有操作保证合法。

输入样例：
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
输出样例：
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
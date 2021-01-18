实现一个单链表，链表初始为空，支持三种操作：

(1) 向链表头插入一个数；

(2) 删除第k个插入的数后面的数；

(3) 在第k个插入的数后插入一个数

现在要对该链表进行M次操作，进行完所有操作后，从头到尾输出整个链表。

注意:题目中第k个插入的数并不是指当前链表的第k个数。例如操作过程中一共插入了n个数，则按照插入的时间顺序，这n个数依次为：第1个插入的数，第2个插入的数，…第n个插入的数。

输入格式
第一行包含整数M，表示操作次数。

接下来M行，每行包含一个操作命令，操作命令可能为以下几种：

(1) “H x”，表示向链表头插入一个数x。

(2) “D k”，表示删除第k个输入的数后面的数（当k为0时，表示删除头结点）。

(3) “I k x”，表示在第k个输入的数后面插入一个数x（此操作中k均大于0）。

输出格式
共一行，将整个链表从头到尾输出。

数据范围
1≤M≤100000
所有操作保证合法。

输入样例：
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
输出样例：
6 4 6 5
import java.util.*;

public class Main{
    private static int N = 100010;
    private static int[] e = new int[N];
    private static int[] ne = new int[N];
    //头节点指针
    private static int hh;
    //下一个节点位置
    private static int idx;

    //初始化第1个插入节点下标为0，所以操作第k个数时都要-1 ！！
    public static void init(){
        //头节点指向空
        hh = -1;
        idx = 0;
    }
    //插到头节点后
    public static void insertH(int x){
        e[idx] = x;
        ne[idx] = hh;
        hh = idx++;
    }
    //插到第k个节点后
    public static void insertK(int k,int x){
        e[idx] = x;
        ne[idx] = ne[k];
        ne[k] = idx++;
    }
    //删除第k个数后面的数
    public static void delete(int k){
        ne[k] = ne[ne[k]];
    }
    public static void main(String[] args){
        //别忘了先初始化！！！否则打印超时
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
                    //当k为0时，删除头结点，不是清空链表
                    hh = ne[hh];
                }else{
                    delete(k - 1);
                }
            }else if("I".equals(op)){
                //k和x接收位置不要写反！！
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

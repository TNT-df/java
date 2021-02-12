在社交媒体上，经常会看到针对某一个观点同意与否的民意调查以及结果。

例如，对某一观点表示支持的有1498人，反对的有902人，那么赞同与反对的比例可以简单的记为1498:902。

不过，如果把调查结果就以这种方式呈现出来，大多数人肯定不会满意。

因为这个比例的数值太大，难以一眼看出它们的关系。

对于上面这个例子，如果把比例记为5:3，虽然与真实结果有一定的误差，但依然能够较为准确地反映调查结果，同时也显得比较直观。

现给出支持人数A，反对人数B，以及一个上限L，请你将A:B化简为A′:B′，要求在A′和B′均不大于L且A′和B′互质（两个整数的最大公约数是1）的前提下，A′B′≥AB且A′B′−AB的值尽可能小。

输入格式
输入共一行，包含三个整数A，B，L，每两个整数之间用一个空格隔开，分别表示支持人数、反对人数以及上限。

输出格式
输出共一行，包含两个整数A′，B′，中间用一个空格隔开，表示化简后的比例。

数据范围
1≤A,B≤106,
1≤L≤100,A/B≤L
输入样例：
1498 902 10
输出样例：
5 3
import java.util.*;

public class Main{
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int L = in.nextInt();
        
        int a = 0,b = 0;
        double dealt = 1e9;
        for(int i = 0;i<=L;i++){
            for(int j =1;j<=L ;j++){
                double x =i * 1.0/j;
                double X = A * 1.0/B;
                if(x>=X&&x-X<dealt){
                    dealt = x-X;
                    a = i;
                    b= j;
                }
            }
        }
        
        System.out.println(a+" "+b);
    }
}
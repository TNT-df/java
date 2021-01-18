import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class bigNumMul {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s1= input.next();
        int b =input.nextInt();
        int[] a= new int[s1.length()];
        for(int i = 0,j=s1.length()-1;i<s1.length();i++,j--){
            a[i] = s1.charAt(j)-'0';
        }
        mul(a,b);
    }
    public static  void mul(int a[],int b){
        List<Integer> list = new ArrayList<>();
        int k =0;
        for(int i = 0;i<a.length||k>0;i++){
            if(i<a.length) k+=a[i]*b;
            list.add(k%10);
            k/=10;
        }
        Collections.reverse(list);
        System.out.print(list.toString());
    }
}

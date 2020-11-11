import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class bigNumAdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s1= input.next();
        String s2=input.next();
        int[] a= new int[s1.length()];
        int[] b = new  int[s2.length()];
        for(int i = 0,j=s1.length()-1;i<s1.length();i++,j--){
            a[i] = s1.charAt(j)-'0';
        }
        for(int i = 0,j=s2.length()-1;i<s2.length();i++,j--){
            b[i] = s2.charAt(j)-'0';
        }
        add(a,b);
    }
    public static  void add(int a[],int b[]){
        List<Integer> list = new ArrayList<>();
        int k =0;
        for(int i = 0;i<a.length||i<b.length;i++){
            if(i<a.length) k+=a[i];
            if(i<b.length) k+=b[i];
            list.add(k%10);
            k/=10;
        }
        if(k!=0){
            list.add(1);
        }
        Collections.reverse(list);
        System.out.print(list.toString());
    }

}

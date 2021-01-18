import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class bigNumSub {

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
            if(compare(a,b)){
                sub(a,b);
            }else{
                sub(b,a);
            }
        }
        public  static boolean compare(int a [],int b []){
            if(a.length!=b.length)
                return a.length>=b.length;
            for(int i = a.length-1;i>=0;i--){
                if(a[i]!=b[i])
                    if(a[i]>b[i])
                        return true;
            }
            return false;
        }

        public static  void sub(int a[],int b[]) {
            List<Integer> list = new ArrayList<>();
            int k=0;
            for(int i = 0;i<a.length;i++){
                k=a[i]-k;
                if(i<b.length) k-=b[i];
                list.add((k+10)%10);
                if(k<0) k=1;
                else {
                    k=0;
                }
            }
          while(list.size()>1&&list.get(list.size()-1)==0){
              list.remove(list.size()-1);
          }
            Collections.reverse(list);
            System.out.println(list.toString());
        }


}

import java.util.*;
 public class Main{
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	int x = input.nextInt();
	int sum = 0;
	 while(x>0){
		x-=lowbit(x);
		sum++;
   }
   System.out.print(sum);
   public static int lowbit(int x){
      return x&(-x);
    }
}

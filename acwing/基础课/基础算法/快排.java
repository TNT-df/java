快速排序
public class quickSort{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] a = new int[n.length];
    for(int i = 0; i<n;i++){
        a[i] = input.nextInt();
    }
    qs(a,0,n-1);
     for(int i = 0; i<n;i++){
      System.out.print(a[i]+ " ");
    }
    }
    public void sqs(int a[],int l ,int r){
    if(l>=r)
    return 0;
        int x = a[l];
        int i = l-1;
        int j = r+1;
        while( i< j){
            do i++;
            while(a[i] < x);
            do j--;
            while(a[j] > x);
            if(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j]  = temp;
            }
        }
        qs(a,l,j);
        qs(a,j+1,r);
    }
}
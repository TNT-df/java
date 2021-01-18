import java.util.Scanner;

public class MergeSort {
    public static int n ;
    public static int [] res ;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] a= new int[n];
        for(int i = 0;i<n;i++){
            a[i] = input.nextInt();
        }
        res = new int[n];
        merge(a,0,n-1);
        for(int i = 0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }
    public static void merge(int a[],int l,int r){
        if(l>=r) //结果只有一个退出
            return;
        int mid = l+r >>1;
        merge(a,l,mid);
        merge(a,mid+1,r);
        int k = 0,i=l,j=mid+1;
        while(i<=mid&&j<=r){   //合并
            if(a[i]<=a[j]) res[k++] = a[i++];
            else res[k++] = a[j++];
        }
        while(i <= mid) res[k++] = a[i++];
        while(j<=r) res[k++] = a[j++];

        for(i=l,j=0;i<=r;i++,j++){
            a[i] = res[j];
        }
    }

}

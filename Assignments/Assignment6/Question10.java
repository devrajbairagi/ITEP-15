import java.util.*;
class Question10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        if(n>0){
            int last=a[n-1];
            for(int i=n-1;i>0;i--) a[i]=a[i-1];
            a[0]=last;
        }
        for(int i=0;i<n;i++) System.out.print(a[i]+(i==n-1?"":" "));
    }
}
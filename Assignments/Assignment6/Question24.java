import java.util.*;
class Question24{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        if(n>=2){
            int t=a[0]; a[0]=a[n-1]; a[n-1]=t;
        }
        for(int i=0;i<n;i++) System.out.print(a[i]+(i==n-1?"":" "));
    }
}
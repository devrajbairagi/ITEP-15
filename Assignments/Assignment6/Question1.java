import java.util.*;
class Question1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        if(n==1){ System.out.println(0); return; }
        for(int i=0;i<n;i++){
            boolean left = (i==0) || a[i]>=a[i-1];
            boolean right = (i==n-1) || a[i]>=a[i+1];
            if(left && right){ System.out.println(i); return; }
        }
        System.out.println(-1);
    }
}
import java.util.*;
class Question7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int s=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int l=0, sum=0;
        for(int r=0;r<n;r++){
            sum += a[r];
            while(sum> s && l<=r) sum -= a[l++];
            if(sum==s){ System.out.println((l+1)+" "+(r+1)); return; }
        }
        System.out.println(-1);
    }
}
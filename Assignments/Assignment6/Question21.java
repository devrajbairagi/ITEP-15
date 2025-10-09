import java.util.*;
class Question21{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        long curr=0;
        for(int i=0;i<n;i++) curr += (long)i*a[i];
        long sum=0; for(int v:a) sum+=v;
        long max=curr;
        for(int i=1;i<n;i++){
            curr = curr + sum - (long)n*a[n-i];
            if(curr>max) max=curr;
        }
        System.out.println(max);
    }
}
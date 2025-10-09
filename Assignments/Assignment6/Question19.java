import java.util.*;
class Question19{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        long maxProd=a[0], minProd=a[0], ans=a[0];
        for(int i=1;i<n;i++){
            if(a[i]<0){
                long t=maxProd; maxProd=minProd; minProd=t;
            }
            maxProd = Math.max(a[i], maxProd * a[i]);
            minProd = Math.min(a[i], minProd * a[i]);
            ans = Math.max(ans, maxProd);
        }
        System.out.println(ans);
    }
}
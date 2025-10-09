import java.util.*;
class Question5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int[] b=a.clone();
        Arrays.sort(b);
        int kthSmall = b[Math.max(0,Math.min(n-1,k-1))];
        int kthLarge = b[Math.max(0,Math.min(n-1,n-k))];
        System.out.println(kthSmall+" "+kthLarge);
    }
}
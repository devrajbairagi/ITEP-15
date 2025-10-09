import java.util.*;
class Question18{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        long maxEnding=a[0], maxSoFar=a[0];
        for(int i=1;i<n;i++){
            maxEnding = Math.max(a[i], maxEnding + a[i]);
            maxSoFar = Math.max(maxSoFar, maxEnding);
        }
        System.out.println(maxSoFar);
    }
}
import java.util.*;
class Question33{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int[] a=new int[n]; for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int key=sc.nextInt();
        int l=0,r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]==key){ System.out.println(mid); return; }
            if(a[mid]<key) l=mid+1; else r=mid-1;
        }
        System.out.println(-1);
    }
}
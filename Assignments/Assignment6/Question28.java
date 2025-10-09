import java.util.*;
class Question28{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++) ar[i]=sc.nextInt();
        int val=sc.nextInt();
        int l=0,r=n-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(ar[mid]==val){ System.out.println("element found"); return; }
            if(ar[mid]<val) l=mid+1; else r=mid-1;
        }
        System.out.println("element not found");
    }
}
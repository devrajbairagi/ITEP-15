import java.util.*;
class Question29{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] A=new int[m];
        for(int i=0;i<m;i++) A[i]=sc.nextInt();
        int key=sc.nextInt();
        int l=0,r=m-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(A[mid]==key){ System.out.println(mid); return; }
            if(A[mid]<key) l=mid+1; else r=mid-1;
        }
        System.out.println(-1);
    }
}
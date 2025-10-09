import java.util.*;
class Question30{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(), n=sc.nextInt();
        int[] A=new int[m], B=new int[n];
        for(int i=0;i<m;i++) A[i]=sc.nextInt();
        for(int j=0;j<n;j++) B[j]=sc.nextInt();
        int i=0,j=n-1,idx=0;
        int[] C=new int[m+n];
        while(i<m && j>=0){
            if(A[i]<=B[j]) C[idx++]=A[i++]; else C[idx++]=B[j--];
        }
        while(i<m) C[idx++]=A[i++];
        while(j>=0) C[idx++]=B[j--];
        for(int k=0;k<idx;k++) System.out.print(C[k]+(k==idx-1?"":" "));
    }
}
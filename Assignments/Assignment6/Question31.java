import java.util.*;
class Question31{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(), n=sc.nextInt();
        int[] X=new int[m], Y=new int[n];
        for(int i=0;i<m;i++) X[i]=sc.nextInt();
        for(int j=0;j<n;j++) Y[j]=sc.nextInt();
        int i=0,j=0,idx=0;
        int[] Z=new int[m+n];
        while(i<m && j<n){
            if(X[i]>=Y[j]) Z[idx++]=X[i++]; else Z[idx++]=Y[j++];
        }
        while(i<m) Z[idx++]=X[i++];
        while(j<n) Z[idx++]=Y[j++];
        for(int k=0;k<idx;k++) System.out.print(Z[k]+(k==idx-1?"":" "));
    }
}
import java.util.*;
class Question9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), m=sc.nextInt();
        int[] a=new int[n], b=new int[m];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int j=0;j<m;j++) b[j]=sc.nextInt();
        int i=0,j=0;
        int count=0;
        Integer last=null;
        while(i<n || j<m){
            int val;
            if(i<n && (j==m || a[i]<b[j])) val=a[i++]; else if(j<m && (i==n || b[j]<a[i])) val=b[j++]; else { val=a[i]; i++; j++; }
            if(last==null || last!=val){ count++; last=val; }
        }
        System.out.println(count);
    }
}
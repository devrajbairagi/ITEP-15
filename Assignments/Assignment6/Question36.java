import java.util.*;
class Question36{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int[] a=new int[n]; for(int i=0;i<n;i++) a[i]=sc.nextInt();
        boolean swapped=true;
        for(int i=0;i<n-1 && swapped;i++){
            swapped=false;
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){ int t=a[j]; a[j]=a[j+1]; a[j+1]=t; swapped=true; }
            }
        }
        for(int i=0;i<n;i++) System.out.print(a[i]+(i==n-1?"":" "));
    }
}
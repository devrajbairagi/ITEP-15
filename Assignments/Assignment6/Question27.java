import java.util.*;
class Question27{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int val=sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++) if(a[i]==val){ found=true; break; }
        System.out.println(found ? "element found" : "element not found");
    }
}
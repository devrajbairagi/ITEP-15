import java.util.*;
class Question2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int min=a[0], max=a[0];
        for(int v:a){ if(v<min) min=v; if(v>max) max=v; }
        System.out.println(min+" "+max);
    }
}
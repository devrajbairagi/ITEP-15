import java.util.*;
class Question22{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int num=sc.nextInt();
        int lesser=Integer.MIN_VALUE, greater=Integer.MAX_VALUE;
        for(int v:a){
            if(v<num) lesser=Math.max(lesser,v);
            if(v>num) greater=Math.min(greater,v);
        }
        if(lesser==Integer.MIN_VALUE) System.out.println("No Lesser");
        else System.out.println(lesser);
        if(greater==Integer.MAX_VALUE) System.out.println("No Greater");
        else System.out.println(greater);
    }
}
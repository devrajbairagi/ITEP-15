import java.util.*;
class Question6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[] a=new int[n];
        int cnt=0;
        for(int i=0;i<n;i++){ a[i]=sc.nextInt(); if(a[i]==target) cnt++; }
        System.out.println(cnt);
    }
}
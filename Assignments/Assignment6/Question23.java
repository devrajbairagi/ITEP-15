import java.util.*;
class Question23{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sum=0;
        for(int i=0;i<n;i++) sum+=sc.nextInt();
        double avg = n>0 ? (double)sum/n : 0.0;
        System.out.println(sum+" "+avg);
    }
}
import java.util.*;
class Question20{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        Set<Integer> s=new HashSet<>();
        for(int v:a) s.add(v);
        int best=0;
        for(int v:s){
            if(!s.contains(v-1)){
                int cur=v;
                int len=1;
                while(s.contains(cur+1)){ cur++; len++; }
                best=Math.max(best,len);
            }
        }
        System.out.println(best);
    }
}
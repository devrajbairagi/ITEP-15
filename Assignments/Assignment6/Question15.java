import java.util.*;
class Question15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n;i++) if(a[i]==0) a[i]=-1;
        Map<Integer,Integer> cnt=new HashMap<>();
        int sum=0; long ans=0;
        cnt.put(0,1);
        for(int v:a){
            sum += v;
            ans += cnt.getOrDefault(sum,0);
            cnt.put(sum, cnt.getOrDefault(sum,0)+1);
        }
        System.out.println(ans);
    }
}
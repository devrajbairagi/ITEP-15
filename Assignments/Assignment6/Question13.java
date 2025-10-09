import java.util.*;
class Question13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        Map<Integer,Integer> idx=new HashMap<>();
        int ans=-1;
        for(int i=0;i<n;i++){
            if(idx.containsKey(a[i])){ ans=idx.get(a[i]); break; }
            idx.put(a[i], i);
        }
        if(ans==-1) System.out.println(-1); else System.out.println(ans);
    }
}
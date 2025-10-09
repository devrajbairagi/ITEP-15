import java.util.*;
class Question11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int K=sc.nextInt();
        int[] a=new int[n];
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<n;i++){ a[i]=sc.nextInt(); freq.put(a[i], freq.getOrDefault(a[i],0)+1); }
        long count=0;
        for(int v:freq.keySet()){
            int needed=K-v;
            if(needed==v){
                long f=freq.get(v);
                count += f*(f-1)/2;
            } else if(freq.containsKey(needed) && needed>v){
                count += (long)freq.get(v)*freq.get(needed);
            }
        }
        System.out.println(count);
    }
}
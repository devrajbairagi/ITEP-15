import java.util.*;
class Question14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int[] a=new int[n];
        Map<Integer,Integer> freq=new LinkedHashMap<>();
        for(int i=0;i<n;i++){ a[i]=sc.nextInt(); freq.put(a[i], freq.getOrDefault(a[i],0)+1); }
        int ans=0;
        for(Map.Entry<Integer,Integer> e:freq.entrySet()){
            if(e.getValue()==1){ ans=e.getKey(); System.out.println(ans); return; }
        }
        System.out.println(0);
    }
}
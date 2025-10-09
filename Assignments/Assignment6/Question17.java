import java.util.*;
class Question17{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        Set<Integer> seen=new HashSet<>();
        int sum=0;
        for(int v:a){
            sum += v;
            if(sum==0 || seen.contains(sum)){ System.out.println("Yes"); return; }
            seen.add(sum);
        }
        System.out.println("No");
    }
}
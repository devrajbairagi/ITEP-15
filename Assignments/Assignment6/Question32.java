import java.util.*;
class Question32{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt(); int[] A=new int[m]; for(int i=0;i<m;i++) A[i]=sc.nextInt();
        int n=sc.nextInt(); int[] B=new int[n]; for(int i=0;i<n;i++) B[i]=sc.nextInt();
        List<Integer> evens=new ArrayList<>(), odds=new ArrayList<>();
        for(int x:A){ if(x%2==0) evens.add(x); else odds.add(x); }
        List<Integer> evensB=new ArrayList<>(), oddsB=new ArrayList<>();
        for(int x:B){ if(x%2==0) evensB.add(x); else oddsB.add(x); }
        List<Integer> C=new ArrayList<>();
        for(int x:evens) C.add(x);
        for(int i=odds.size()-1;i>=0;i--) C.add(odds.get(i));
        for(int x:evensB) C.add(x);
        for(int i=oddsB.size()-1;i>=0;i--) C.add(oddsB.get(i));
        for(int i=0;i<C.size();i++) System.out.print(C.get(i)+(i==C.size()-1?"":" "));
    }
}
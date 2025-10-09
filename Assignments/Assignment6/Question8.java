import java.util.*;
class Question8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> pos=new ArrayList<>(), neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            int v=sc.nextInt();
            if(v<0) neg.add(v); else pos.add(v);
        }
        for(int x:pos) System.out.print(x+" ");
        for(int x:neg) System.out.print(x+" ");
    }
}
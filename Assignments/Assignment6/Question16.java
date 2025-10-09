import java.util.*;
class Question16{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> pos=new ArrayList<>(), neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            int v=sc.nextInt();
            if(v>=0) pos.add(v); else neg.add(v);
        }
        int i=0,j=0;
        List<Integer> out=new ArrayList<>();
        while(i<pos.size() && j<neg.size()){
            out.add(pos.get(i++));
            out.add(neg.get(j++));
        }
        while(i<pos.size()) out.add(pos.get(i++));
        while(j<neg.size()) out.add(neg.get(j++));
        for(int k=0;k<out.size();k++) System.out.print(out.get(k)+(k==out.size()-1?"":" "));
    }
}
import java.util.*;
class Question12{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt(); int[] A=new int[n1]; for(int i=0;i<n1;i++) A[i]=sc.nextInt();
        int n2=sc.nextInt(); int[] B=new int[n2]; for(int i=0;i<n2;i++) B[i]=sc.nextInt();
        int n3=sc.nextInt(); int[] C=new int[n3]; for(int i=0;i<n3;i++) C[i]=sc.nextInt();
        int i=0,j=0,k=0;
        List<Integer> res=new ArrayList<>();
        while(i<n1 && j<n2 && k<n3){
            if(A[i]==B[j] && B[j]==C[k]){
                if(res.isEmpty() || res.get(res.size()-1)!=A[i]) res.add(A[i]);
                i++; j++; k++;
            } else {
                int m=Math.min(A[i], Math.min(B[j], C[k]));
                if(A[i]==m) i++; else if(B[j]==m) j++; else k++;
            }
        }
        if(res.isEmpty()) System.out.println();
        else{ for(int idx=0;idx<res.size();idx++) System.out.print(res.get(idx)+(idx==res.size()-1?"":" ")); }
    }
}
import java.util.Scanner;
class Question29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        System.out.print("Enter four numbers: ");
        a=sc.nextInt(); b=sc.nextInt(); c=sc.nextInt(); d=sc.nextInt();
        int min=a;
        if(b<min)min=b;
        if(c<min)min=c;
        if(d<min)min=d;
        System.out.println("Lowest number is: "+min);
    }
}
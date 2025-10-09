import java.util.Scanner;
class Question36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter three angles: ");
        a=sc.nextInt(); b=sc.nextInt(); c=sc.nextInt();
        if(a+b+c==180)
            System.out.println("Valid triangle");
        else
            System.out.println("Invalid triangle");
    }
}
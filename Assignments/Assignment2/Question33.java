import java.util.Scanner;
class Question33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        if((n & 1)==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
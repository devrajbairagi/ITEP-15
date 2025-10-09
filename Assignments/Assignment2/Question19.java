import java.util.Scanner;
class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, temp;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping using third variable: a=" + a + " b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping without third variable: a=" + a + " b=" + b);
    }
}
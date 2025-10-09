import java.util.Scanner;
class Question22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a > b && a > c)
            System.out.println(a + " is greatest");
        else if(b > c)
            System.out.println(b + " is greatest");
        else
            System.out.println(c + " is greatest");
    }
}
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side of triangle (cm): ");
        int a = sc.nextInt();
        System.out.print("Enter second side of triangle (cm): ");
        int b = sc.nextInt();
        System.out.print("Enter perimeter of triangle (cm): ");
        int perimeter = sc.nextInt();

        int c = perimeter - (a + b);
        double s = perimeter / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Third side: " + c + " cm");
        System.out.println("Area of triangle: " + area + " cm²");
    }
}

import java.util.Scanner;

 class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of triangle (cm): ");
        double base = sc.nextDouble();
        System.out.print("Enter area of triangle (cm²): ");
        double area = sc.nextDouble();

        double height = (2 * area) / base;

        System.out.println("Height of triangle: " + height + " cm");
    }
}

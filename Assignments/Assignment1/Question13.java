import java.util.Scanner;

 class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter area of triangle (cm²): ");
        double area = sc.nextDouble();
        System.out.print("Enter one leg (cm): ");
        double leg1 = sc.nextDouble();

        double leg2 = (2 * area) / leg1;

        System.out.println("Other leg = " + leg2 + " cm");
    }
}

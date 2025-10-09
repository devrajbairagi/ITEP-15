import java.util.Scanner;

 class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter altitude (cm): ");
        double height = sc.nextDouble();
        System.out.print("Enter area (in m²): ");
        double areaInMeters = sc.nextDouble();

        double area = areaInMeters * 10000; // convert to cm²
        double base = (2 * area) / height;

        System.out.println("Base of triangle: " + base + " cm");
    }
}

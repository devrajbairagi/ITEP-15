import java.util.Scanner;

 class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter area of triangle (m²): ");
        double area = sc.nextDouble();
        System.out.print("Enter ratio base:height (e.g., 8 5): ");
        int baseRatio = sc.nextInt();
        int heightRatio = sc.nextInt();

        int totalRatio = baseRatio * heightRatio;
        double base = Math.sqrt((area * 2 * baseRatio) / heightRatio);
        double height = (heightRatio * base) / baseRatio;

        System.out.println("Base = " + base + " m");
        System.out.println("Height = " + height + " m");
    }
}

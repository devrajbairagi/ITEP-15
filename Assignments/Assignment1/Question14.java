import java.util.Scanner;

 class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter diagonal (m): ");
        double diagonal = sc.nextDouble();
        System.out.print("Enter height from first vertex (m): ");
        double h1 = sc.nextDouble();
        System.out.print("Enter height from second vertex (m): ");
        double h2 = sc.nextDouble();

        double area = 0.5 * diagonal * (h1 + h2);
        System.out.println("Area of field = " + area + " m²");
    }
}

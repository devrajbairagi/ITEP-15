import java.util.Scanner;

 class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of equilateral triangle (cm): ");
        double side = sc.nextDouble();

        double area = (Math.sqrt(3) / 4) * side * side;

        System.out.println("Area of equilateral triangle: " + area + " cm²");
    }
}

import java.util.Scanner;

 class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of equal sides (cm): ");
        double side = sc.nextDouble();

        double area = (side * side) / 2;

        System.out.println("Area of isosceles right-angled triangle: " + area + " cm²");
    }
}

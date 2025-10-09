import java.util.Scanner;

 class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hypotenuse (cm): ");
        double hypotenuse = sc.nextDouble();
        System.out.print("Enter one side (cm): ");
        double side = sc.nextDouble();

        double otherSide = Math.sqrt(hypotenuse * hypotenuse - side * side);
        double area = (side * otherSide) / 2;

        System.out.println("Other side = " + otherSide + " cm");
        System.out.println("Area = " + area + " cm²");
    }
}

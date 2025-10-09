import java.util.Scanner;

 class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of room (m): ");
        double length = sc.nextDouble();
        System.out.print("Enter width of room (m): ");
        double width = sc.nextDouble();

        double area = length * width;
        System.out.println("Carpet needed: " + area + " square meters");
    }
}
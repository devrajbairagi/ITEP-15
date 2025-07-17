import java.util.Scanner;
 class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of board (m): ");
        double length = sc.nextDouble();
        System.out.print("Enter width of board (m): ");
        double width = sc.nextDouble();

        double perimeter = 2 * (length + width);
        System.out.println("Ribbon needed: " + perimeter + " meters");
    }
}
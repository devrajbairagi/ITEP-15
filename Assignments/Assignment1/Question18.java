import java.util.Scanner;
 class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of park (m): ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of park (m): ");
        double breadth = sc.nextDouble();

        double perimeter = 2 * (length + breadth);
        double totalDistance = perimeter * 10 / 1000; // in km
        System.out.println("Total distance covered in a day: " + totalDistance + " km");
    }
}
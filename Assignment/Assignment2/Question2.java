import java.util.Scanner;

 class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter area of rectangle (cm²): ");
        int area = sc.nextInt();
        System.out.print("Enter breadth of rectangle (cm): ");
        int breadth = sc.nextInt();

        int length = area / breadth;
        int perimeter = 2 * (length + breadth);

        System.out.println("Length: " + length + " cm");
        System.out.println("Perimeter: " + perimeter + " cm");
    }
}

import java.util.Scanner;

 class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of land (m): ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of land (m): ");
        int breadth = sc.nextInt();
        System.out.print("Enter cost per 100 sq.m: ");
        double rate = sc.nextDouble();

        int area = length * breadth;
        double cost = (area / 100.0) * rate;

        System.out.println("Cost of tiling: $" + cost);
    }
}

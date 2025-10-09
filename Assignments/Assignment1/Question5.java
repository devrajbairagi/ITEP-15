import java.util.Scanner;

 class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost of fencing (Rs.): ");
        int cost = sc.nextInt();
        System.out.print("Enter length of park (m): ");
        int length = sc.nextInt();
        System.out.print("Enter rate per meter (Rs.): ");
        int rate = sc.nextInt();

        int perimeter = cost / rate;
        int breadth = (perimeter / 2) - length;
        int area = length * breadth;

        System.out.println("Breadth: " + breadth + " m");
        System.out.println("Perimeter: " + perimeter + " m");
        System.out.println("Area: " + area + " m²");
    }
}

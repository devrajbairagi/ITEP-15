import java.util.Scanner;

 class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle (cm): ");
        int length = sc.nextInt();
        System.out.print("Enter perimeter of rectangle (cm): ");
        int perimeter = sc.nextInt();
        
        int breadth = (perimeter / 2) - length;
        int area = length * breadth;

        System.out.println("Breadth: " + breadth + " cm");
        System.out.println("Area: " + area + " cm²");
    }
}

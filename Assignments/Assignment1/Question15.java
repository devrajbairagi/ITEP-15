import java.util.Scanner;
class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Shelly's garden (m): ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of Shelly's garden (m): ");
        int breadth = sc.nextInt();
        System.out.print("Enter side of Rachel's square garden (m): ");
        int side = sc.nextInt();

        int areaShelly = length * breadth;
        int areaRachel = side * side;

        if (areaShelly > areaRachel) {
            System.out.println("Shelly's garden is bigger by " + (areaShelly - areaRachel) + " m²");
        } else if (areaRachel > areaShelly) {
            System.out.println("Rachel's garden is bigger by " + (areaRachel - areaShelly) + " m²");
        } else {
            System.out.println("Both gardens are of equal area.");
        }
    }
}

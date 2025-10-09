import java.util.Scanner;

 class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter tile length (cm): ");
        int tileLength = sc.nextInt();
        System.out.print("Enter tile breadth (cm): ");
        int tileBreadth = sc.nextInt();
        System.out.print("Enter floor length (cm): ");
        int floorLength = sc.nextInt();
        System.out.print("Enter floor breadth (cm): ");
        int floorBreadth = sc.nextInt();

        int tileArea = tileLength * tileBreadth;
        int floorArea = floorLength * floorBreadth;
        int tilesNeeded = floorArea / tileArea;

        System.out.println("Tiles needed: " + tilesNeeded);
    }
}

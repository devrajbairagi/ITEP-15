import java.util.Scanner;

 class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double brickL = 15, brickB = 8, brickH = 5;
        double wallL = 1500, wallB = 1000, wallH = 800;

        double brickVol = brickL * brickB * brickH;
        double wallVol = wallL * wallB * wallH;

        int numBricks = (int)(wallVol / brickVol);
        System.out.println("Bricks required: " + numBricks);
    }
}
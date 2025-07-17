class Question24 {
    public static void main(String[] args) {
        double brickVol = 25 * 10 * 7.5;
        double wallVol = 2000 * 100 * 75;
        int bricks = (int)(wallVol / brickVol);
        double cost = (bricks / 1000.0) * 900;

        System.out.println("Bricks needed: " + bricks);
        System.out.println("Cost: $" + cost);
    }
}
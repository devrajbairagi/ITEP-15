class Question26 {
    public static void main(String[] args) {
        double area = 120 * 2.4;
        double brickArea = 24 * 15 / 10000.0;
        int bricks = (int)(area / brickArea);
        System.out.println("Bricks required: " + bricks);
    }
}
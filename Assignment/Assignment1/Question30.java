class Question30 {
    public static void main(String[] args) {
        int tileArea = 5 * 8;
        int roomArea = 200 * 400;
        int tiles = roomArea / tileArea;
        System.out.println("Tiles required: " + tiles);
    }
}
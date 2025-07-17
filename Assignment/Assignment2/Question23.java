class Question23 {
    public static void main(String[] args) {
        int side = 3;
        int cartonVol = 15 * 9 * 12;
        int boxVol = side * side * side;
        int boxes = cartonVol / boxVol;

        System.out.println("Number of cubical boxes: " + boxes);
    }
}
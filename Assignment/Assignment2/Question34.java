class Question34 {
    public static void main(String[] args) {
        int base1 = 128, base2 = 92, height = 40, walkway = 4;
        int trapezoid = (base1 + base2) * height / 2;
        int walkwayArea = (base1 + base2) / 2 * walkway;
        int totalArea = trapezoid + walkwayArea;
        System.out.println("Total area: " + totalArea + " m²");
    }
}
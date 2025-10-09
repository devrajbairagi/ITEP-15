class Question37 {
    public static void main(String[] args) {
        double surface = 149, h = 6;
        double r = surface / (2 * Math.PI * (h + (surface / (2 * Math.PI * h))));
        double d = 2 * r;
        System.out.println("Diameter: " + d + " cm");
    }
}
class Question38 {
    public static void main(String[] args) {
        double V = 1287, r = 10;
        double h = V / (Math.PI * r * r);
        double surface = 2 * Math.PI * r * (r + h);
        System.out.println("Surface area: " + surface);
    }
}
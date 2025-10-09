class Question3 {
    private double width;
    private double height;
    public void setWidth(double width) { this.width = width; }
    public void setHeight(double height) { this.height = height; }
    public double getArea() { return width * height; }
    public double getPerimeter() { return 2 * (width + height); }
    public static void main(String[] args) {
        Question3 r = new Question3();
        r.setWidth(5);
        r.setHeight(3);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
    }
}

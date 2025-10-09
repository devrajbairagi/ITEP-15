class Question9 {
    private double radius;
    public void setRadius(double radius) { this.radius = radius; }
    public double getArea() { return Math.PI * radius * radius; }
    public double getCircumference() { return 2 * Math.PI * radius; }
    public void display() {
        System.out.println("Area: " + getArea() + ", Circumference: " + getCircumference());
    }
    public static void main(String[] args) {
        Question9 c = new Question9();
        c.setRadius(7);
        c.display();
    }
}
class Question10 {
    private double length;
    private double width;
    public void setLength(double length) { this.length = length; }
    public void setWidth(double width) { this.width = width; }
    public double getArea() { return length * width; }
    public void display() {
        System.out.println("Area of Rectangle: " + getArea());
    }
    public static void main(String[] args) {
        Question10 r = new Question10();
        r.setLength(10);
        r.setWidth(5);
        r.display();
    }
}
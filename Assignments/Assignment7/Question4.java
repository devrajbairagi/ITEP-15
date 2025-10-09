class Question4 {
    private String brand;
    private String model;
    private int year;
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public void display() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
    public static void main(String[] args) {
        Question4 car = new Question4();
        car.setBrand("Toyota");
        car.setModel("Corolla");
        car.setYear(2020);
        car.display();
    }
}
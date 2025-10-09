class Question8 {
    private String brand;
    private String model;
    private double price;
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setPrice(double price) { this.price = price; }
    public boolean isAffordable() { return price < 20000; }
    public void display() {
        System.out.println("Mobile: " + brand + " " + model + ", Affordable: " + isAffordable());
    }
    public static void main(String[] args) {
        Question8 m = new Question8();
        m.setBrand("Samsung");
        m.setModel("Galaxy M14");
        m.setPrice(18000);
        m.display();
    }
}
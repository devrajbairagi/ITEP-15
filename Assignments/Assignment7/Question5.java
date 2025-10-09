class Question5 {
    private int productId;
    private String name;
    private int quantity;
    private double price;
    public void setProductId(int productId) { this.productId = productId; }
    public void setName(String name) { this.name = name; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setPrice(double price) { this.price = price; }
    public double getTotalValue() { return quantity * price; }
    public void display() {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Total Value: " + getTotalValue());
    }
    public static void main(String[] args) {
        Question5 p = new Question5();
        p.setProductId(101);
        p.setName("Laptop");
        p.setQuantity(3);
        p.setPrice(55000);
        p.display();
    }
}
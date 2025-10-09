class Question2 {
    private String title;
    private String author;
    private double price;
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setPrice(double price) { this.price = price; }
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
    public static void main(String[] args) {
        Question2 b = new Question2();
        b.setTitle("Java Programming");
        b.setAuthor("James");
        b.setPrice(450.75);
        b.display();
    }
}
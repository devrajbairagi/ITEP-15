class Question13 {
    private static class Product {
        String id;
        String name;
        int qty;
        Product(String id, String name, int qty) { this.id = id; this.name = name; this.qty = qty; }
        public String toString() { return id + " " + name + " " + qty; }
    }
    private static Product[] products = new Product[100];
    private static int count = 0;
    public static void addProduct(Product p) { if (count < products.length) products[count++] = p; }
    public static void removeProduct(String id) {
        for (int i = 0; i < count; i++) {
            if (products[i].id.equals(id)) {
                for (int j = i; j < count - 1; j++) products[j] = products[j + 1];
                products[--count] = null;
                break;
            }
        }
    }
    public static void checkLowInventory(int threshold) {
        for (int i = 0; i < count; i++) if (products[i].qty < threshold) System.out.println(products[i]);
    }
    public static void main(String[] args) {
        addProduct(new Product("P1","Pen",50));
        addProduct(new Product("P2","Book",3));
        addProduct(new Product("P3","Pencil",10));
        checkLowInventory(5);
    }
}

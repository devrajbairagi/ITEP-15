class Question5 {
    private String title;
    private String author;
    private String isbn;
    private static Question5[] collection = new Question5[100];
    private static int count = 0;
    public Question5(String title, String author, String isbn) { this.title = title; this.author = author; this.isbn = isbn; }
    public static void addBook(Question5 b) { if (count < collection.length) collection[count++] = b; }
    public static void removeBook(String isbn) {
        for (int i = 0; i < count; i++) {
            if (collection[i].isbn.equals(isbn)) {
                for (int j = i; j < count - 1; j++) collection[j] = collection[j + 1];
                collection[--count] = null;
                break;
            }
        }
    }
    public String toString() { return title + " by " + author + " ISBN:" + isbn; }
    public static void main(String[] args) {
        Question5 b1 = new Question5("Java Basics", "A. Author", "ISBN001");
        Question5 b2 = new Question5("Advanced Java", "B. Writer", "ISBN002");
        addBook(b1);
        addBook(b2);
        System.out.println(collection[0]);
        System.out.println(collection[1]);
        removeBook("ISBN001");
        for (int i = 0; i < count; i++) System.out.println(collection[i]);
    }
}

class Question11 {
    private static Question5[] books = new Question5[100];
    private static int count = 0;
    public static void addBook(Question5 b) { if (count < books.length) books[count++] = b; }
    public static void removeBook(String isbn) {
        for (int i = 0; i < count; i++) {
            if (books[i].toString().contains(isbn)) {
                for (int j = i; j < count - 1; j++) books[j] = books[j + 1];
                books[--count] = null;
                break;
            }
        }
    }
    public static void main(String[] args) {
        Question5 b1 = new Question5("Learn Java","X","B001");
        Question5 b2 = new Question5("Data Structures","Y","B002");
        addBook(b1);
        addBook(b2);
        for (int i = 0; i < count; i++) System.out.println(books[i]);
        removeBook("B001");
        for (int i = 0; i < count; i++) System.out.println(books[i]);
    }
}

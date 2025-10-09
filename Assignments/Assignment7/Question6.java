class Question6 {
    private String name;
    private String genre;
    private double rating;
    public void setName(String name) { this.name = name; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setRating(double rating) { this.rating = rating; }
    public boolean isHit() { return rating >= 8.0; }
    public void display() {
        System.out.println("Movie: " + name + ", Genre: " + genre + ", Hit: " + isHit());
    }
    public static void main(String[] args) {
        Question6 m = new Question6();
        m.setName("Inception");
        m.setGenre("Sci-Fi");
        m.setRating(8.5);
        m.display();
    }
}
class Question8 {
    private String color;
    private int duration;
    public Question8(String color, int duration) { this.color = color; this.duration = duration; }
    public void changeColor(String color, int duration) { this.color = color; this.duration = duration; }
    public boolean isRed() { return "red".equalsIgnoreCase(color); }
    public boolean isGreen() { return "green".equalsIgnoreCase(color); }
    public String toString() { return color + " " + duration; }
    public static void main(String[] args) {
        Question8 t = new Question8("red", 30);
        System.out.println(t);
        t.changeColor("green", 45);
        System.out.println(t.isGreen());
    }
}

class Question1 {
    private String name;
    private int age;
    public Question1(String name, int age) { this.name = name; this.age = age; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public static void main(String[] args) {
        Question1 p1 = new Question1("Alice", 30);
        Question1 p2 = new Question1("Bob", 25);
        System.out.println(p1.getName() + " " + p1.getAge());
        System.out.println(p2.getName() + " " + p2.getAge());
    }
}

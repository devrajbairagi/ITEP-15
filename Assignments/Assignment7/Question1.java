class Question1 {
    private int id;
    private String name;
    private double salary;
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
    public static void main(String[] args) {
        Question1 e = new Question1();
        e.setId(1);
        e.setName("John");
        e.setSalary(50000);
        e.display();
    }
}
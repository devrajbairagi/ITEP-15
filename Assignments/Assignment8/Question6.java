class Question6 {
    private String name;
    private String jobTitle;
    private double salary;
    public Question6(String name, String jobTitle, double salary) { this.name = name; this.jobTitle = jobTitle; this.salary = salary; }
    public double calculateBonus(double percent) { return salary * percent / 100.0; }
    public void updateSalary(double amount) { this.salary = amount; }
    public String toString() { return name + " " + jobTitle + " " + salary; }
    public static void main(String[] args) {
        Question6 e = new Question6("Sam", "Developer", 60000);
        System.out.println(e);
        double bonus = e.calculateBonus(10);
        System.out.println("Bonus: " + bonus);
        e.updateSalary(65000);
        System.out.println(e);
    }
}

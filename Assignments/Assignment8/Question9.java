class Question9 {
    private String name;
    private double salary;
    private String hireDate;
    public Question9(String name, double salary, String hireDate) { this.name = name; this.salary = salary; this.hireDate = hireDate; }
    public int getYearsOfService() {
        String[] parts = hireDate.split("-");
        int year = Integer.parseInt(parts[0]);
        java.util.Calendar cal = java.util.Calendar.getInstance();
        int currentYear = cal.get(java.util.Calendar.YEAR);
        return currentYear - year;
    }
    public String toString() { return name + " " + salary + " " + hireDate; }
    public static void main(String[] args) {
        Question9 e = new Question9("Dina", 70000, "2018-06-01");
        System.out.println(e);
        System.out.println("Years: " + e.getYearsOfService());
    }
}

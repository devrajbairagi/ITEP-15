class Question7 {
    private String name;
    private double mathMarks;
    private double scienceMarks;
    public void setName(String name) { this.name = name; }
    public void setMathMarks(double mathMarks) { this.mathMarks = mathMarks; }
    public void setScienceMarks(double scienceMarks) { this.scienceMarks = scienceMarks; }
    public double getAverage() { return (mathMarks + scienceMarks) / 2; }
    public void display() {
        System.out.println("Student: " + name + ", Average Marks: " + getAverage());
    }
    public static void main(String[] args) {
        Question7 s = new Question7();
        s.setName("Rahul");
        s.setMathMarks(85);
        s.setScienceMarks(90);
        s.display();
    }
}
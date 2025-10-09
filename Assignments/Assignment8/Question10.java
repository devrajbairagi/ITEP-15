class Question10 {
    private String name;
    private String grade;
    private String[] courses;
    private int courseCount = 0;
    public Question10(String name, String grade, int maxCourses) { this.name = name; this.grade = grade; this.courses = new String[maxCourses]; }
    public void addCourse(String course) { if (courseCount < courses.length) courses[courseCount++] = course; }
    public void removeCourse(String course) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].equals(course)) {
                for (int j = i; j < courseCount - 1; j++) courses[j] = courses[j + 1];
                courses[--courseCount] = null;
                break;
            }
        }
    }
    public String toString() {
        String s = name + " " + grade + " Courses:";
        for (int i = 0; i < courseCount; i++) s += courses[i] + ",";
        return s;
    }
    public static void main(String[] args) {
        Question10 s = new Question10("Priya", "A", 5);
        s.addCourse("Math");
        s.addCourse("Science");
        System.out.println(s);
        s.removeCourse("Math");
        System.out.println(s);
    }
}

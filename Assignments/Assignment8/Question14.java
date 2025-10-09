class Question14 {
    private static class Person { String name; Person(String n){name=n;} }
    private Person[] students;
    private Person[] teachers;
    private String[] classes;
    private int sCount;
    private int tCount;
    private int cCount;
    public Question14(int maxStudents,int maxTeachers,int maxClasses) {
        students = new Person[maxStudents];
        teachers = new Person[maxTeachers];
        classes = new String[maxClasses];
    }
    public void addStudent(String name){ if(sCount<students.length)students[sCount++]=new Person(name); }
    public void addTeacher(String name){ if(tCount<teachers.length)teachers[tCount++]=new Person(name); }
    public void createClass(String cname){ if(cCount<classes.length)classes[cCount++]=cname; }
    public void removeStudent(String name){ for(int i=0;i<sCount;i++) if(students[i].name.equals(name)){ for(int j=i;j<sCount-1;j++)students[j]=students[j+1]; students[--sCount]=null; break; } }
    public void removeTeacher(String name){ for(int i=0;i<tCount;i++) if(teachers[i].name.equals(name)){ for(int j=i;j<tCount-1;j++)teachers[j]=teachers[j+1]; teachers[--tCount]=null; break; } }
    public static void main(String[] args){ Question14 sch=new Question14(10,10,10); sch.addStudent("A"); sch.addTeacher("T"); sch.createClass("C1"); sch.removeStudent("A"); System.out.println("Done"); }
}

package CollegeJavaPracticals.Practical_1;

public class DefaultConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(5, "Ayush", 75.31f);
    }
}
class Student {
    int rno;
    String name;
    float marks;
    public Student() {
        rno = 3;
        name = "xyz";
        marks = 60.12f;

        // Can also be coded as -->
//        this (3, "xyz", 60.12f);

    }

    public Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}

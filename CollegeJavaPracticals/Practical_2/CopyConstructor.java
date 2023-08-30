package CollegeJavaPracticals.Practical_2;

public class CopyConstructor {
    public static void main(String[] args) {
        Employee e1 = new Employee(213, "Ayush", 2000000);
        Employee e2 = new Employee(e1);
        System.out.println(e1.id);
    }
}

class Employee {
    int id;
    String name;
    double salary;

    protected Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(Employee other) {
        this.id = other.id;
        this.name = other.name;
        this.salary = other.salary;
    }
}

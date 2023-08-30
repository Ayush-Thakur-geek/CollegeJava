package CollegeJavaPracticals.Practical_3;

public class AreaOfCircle {
    private static final double pi = 3.14159265359;
    double radius;
    AreaOfCircle(double radius) {
        this.radius = radius;
    }
    public void calculate() {
        System.out.println(pi * radius * radius);
    }
}

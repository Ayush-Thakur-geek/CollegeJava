package CollegeJavaPracticals.Practical_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();

        AreaOfCircle ar = new AreaOfCircle(r);

        ar.calculate();
    }
}

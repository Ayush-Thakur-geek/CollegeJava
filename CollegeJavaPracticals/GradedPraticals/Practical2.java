package CollegeJavaPracticals.GradedPraticals;

import java.util.Scanner;

public class Practical2 extends Throwable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            int entry = in.nextInt();
            if (count == 0) {
                try {
                    error(entry);
                } catch (InvalidEntry e) {
                    System.out.println(e);
                }
            }

            if (entry < 0) {
                break;
            }
            sum += entry;
            count++;
        }
        try {
            double mean = (double) sum/count;
            System.out.println(mean);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
    private static void error(int n) throws InvalidEntry {
        if (n < 0) {
            throw new InvalidEntry("Please enter valid number");
        }
    }
}

import java.util.*;

class QuadraticEquation {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For ax^2 + bx + c = 0 ");
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();
        double d = b * b - 4.0 * a * c;
        if (d > 0.0) {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The roots are real and unequal ie r1 = " + r1 +
                    " and r2 = " + r2);
        } else if (d == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("The roots are real and equal ie r = " + r1);
        } else {
            System.out.println("Roots are not real ie \n r1 = " +
                    (-b) / (2.0 * a) + " + i " +
                    ((Math.pow(Math.abs(d), 0.5)) / (2.0 * a)) +
                    "\n r1 = " + (-b) / (2.0 * a) + " - i " +
                    (Math.pow(Math.abs(d), 0.5)) / (2.0 * a));

        }
    }
}

import java.util.Scanner;

public class ArithematicCalculator {
    // program does basic simple calculator functions

    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        while (true) {
            // taking the choice input
            System.out.println("Enter 1-add");
            System.out.println("Enter 2-subtract");
            System.out.println("Enter 3-multiply");
            System.out.println("Enter 4-division-quotient");
            System.out.println("Enter 5-division-remainder");
            System.out.println("Enter 6-power/exponent");
            System.out.println("Enter 0-exit");
            ch = sc.nextInt();
            // taking numbers for operation

            // choice based answers
            switch (ch) {
                case 1:
                    System.out.println("Enter 2 numbers");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    System.out.println("sum is " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Enter 2 numbers");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    int ans = 0;
                    if (num1 > num2)
                        ans = num1 - num2;
                    else
                        ans = num2 - num1;
                    System.out.println("difference is " + ans);
                    break;
                case 3:
                    System.out.println("Enter 2 numbers");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    System.out.println("product is " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Enter 2 numbers");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    int quo;
                    if (num2 == 0)
                        System.out.println("divide by zero error division not possible");
                    else {
                        quo = num1 / num2;
                        System.out.println("quotient is " + quo);
                    }
                    break;
                case 5:
                    System.out.println("Enter 2 numbers");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    System.out.println("remainder is " + (num1 % num2));
                    break;
                case 6:
                    System.out.println("Enter 2 numbers");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    System.out.println("result is " + (Math.pow(num1, num2)));
                    break;
                default:
                    System.out.println("invalid case");
                    System.exit(0);// exits out of the while
            }
        }
    }
}
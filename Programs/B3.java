//prime no or not
public class Prime {
    void checkPrime(int num) {
        int i;
        if (num == 1 || num == 0) {
            System.out.println("It's not a prime no ");
            return;
        }
        for (i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("It's not a prime no ");
                return;
            }
        }
        System.out.println("It's a prime no ");
    }
}

public class Main {
    public static void main(String[] args) {
        Prime obj = new Prime();
        obj.checkPrime(65);

    }
}
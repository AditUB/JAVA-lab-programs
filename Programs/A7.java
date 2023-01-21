import java.util.Scanner;

//Interface class
public interface Account {
    public void open_Account();

    public void close_Account();
}

// Method implementation
public class HDFC_Bank implements Account {

    public void open_Account() {
        System.out.println("Welcome to ICICI Bank dear Customer");

    }

    public void close_Account() {
        System.out.println("We are sorry for the inconvinience");

    }

}

// Method implementation
public class ICICI_Bank implements Account {

    public void open_Account() {
        System.out.println("dear customer, Welcome to HDFC Bank");

    }

    public void close_Account() {
        System.out.println("Account Closed");

    }

}

// Helper Class
public class MyAcc {
    public static Account getAccount(int i) {
        switch (i) {
            case 1:
                return new HDFC_Bank();
            case 2:
                return new ICICI_Bank();
            default:
                System.exit(0);
                return new ICICI_Bank();

        }
    }

}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for ICICI and 2 for HDFC");
        int ch;
        ch = sc.nextInt();
        Account A1 = MyAcc.getAccount(ch);
        A1.open_Account();
        A1.close_Account();
        sc.close();
    }

}

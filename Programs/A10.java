import java.util.*;

public class Items {
    Scanner sc = new Scanner(System.in);
    int[] itemCode = new int[50];
    float[] price = new float[50];
    int count = 0;
    int delCode;

    public void getdata() {
        System.out.println("Enter Item Code\n");
        itemCode[count] = sc.nextInt();
        System.out.println("Enter Item Price\n");
        price[count] = sc.nextFloat();
        count++;

    }

    public void display() {
        for (int i = 0; i < count; i++)
            System.out.println("Code = " + itemCode[i] + "\nPrice = " + price[i]);
    }

    public void delete() {

        System.out.println("Enter Item Code to delete\n");
        delCode = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (delCode == itemCode[i])
                price[i] = 0;
        }

    }

    public void sum() {
        float sum = 0;
        for (int i = 0; i < count; i++)
            sum = sum + price[i];
        System.out.println("Sum = " + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Items n = new Items();
        int ch;
        while (true) {
            System.out.println("\n Press 1.Add items \n2.Delete Items \n3..Display items \n4.Display Sum \n5.Exit \n");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    n.getdata();
                    break;
                case 2:
                    n.delete();
                    break;
                case 3:
                    n.display();
                    break;
                case 4:
                    n.sum();
                    break;
                default:
                    System.exit(0);

            }

        }

    }

}
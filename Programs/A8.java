public class Singleton {
    static Singleton sref = null;
    private int i;

    private Singleton(int i) {
        this.i = i;
        System.out.println("Running constructor");
    }

    public static Singleton myMethod(int i) {
        if (sref == null)
            sref = new Singleton(i);
        else
            System.out.println("2nd time onwards\nSent value=" + i);
        return sref;
    }

    public void display() {

        System.out.println("I=" + i);
    }

}

public class Main {
    public static void main(String[] args) {
        Singleton sref1 = Singleton.myMethod(1);
        sref1.display();
        Singleton sref2 = Singleton.myMethod(2);
        sref2.display();
        Singleton sref3 = Singleton.myMethod(3);
        sref3.display();
    }

}
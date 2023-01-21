public class ComplexAddn {
    private float real;
    private float img;

    public ComplexAddn() // Default contructor
    {
        real = 0;
        img = 0;
    }

    public ComplexAddn(float real, float img)// initialize with set value
    {
        this.real = real;
        this.img = img;
    }

    public static ComplexAddn add(ComplexAddn A, ComplexAddn B)// add function on class name
    {
        ComplexAddn C = new ComplexAddn();
        C.real = A.real + B.real;
        C.img = A.img + B.img;
        return C;
    }

    public ComplexAddn add(ComplexAddn B)// add function on object name
    {
        ComplexAddn C = new ComplexAddn();
        C.real = this.real + B.real;
        C.img = this.img + B.img;
        return C;
    }

    public void display()// display value
    {
        System.out.print(real + " ");
        if (img >= 0)
            System.out.print("+");
        System.out.println(img + "i");
    }

}

public class Main {
    public static void main(String[] args) {
        ComplexAddn C1 = new ComplexAddn(7.1f, 8.3f); // initializing 2 complex numbers
        ComplexAddn C2 = new ComplexAddn(-13.5f, 2.1f);
        ComplexAddn C3 = new ComplexAddn(); // value for adding on class name
        ComplexAddn C4 = new ComplexAddn(); // value for adding with class name
        C3 = ComplexAddn.add(C1, C2); // static method addition
        C4 = C1.add(C2);// normal method addition
        C3.display();// display complex number
        C4.display();
    }
}
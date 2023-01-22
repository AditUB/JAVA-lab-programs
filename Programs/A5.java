import java.nio.file.Paths;

interface car{
    public void startEngine();
    public void moveCar();
    public void stopEngine();
}
 class BMW implements car{
    public void startEngine()
    {
        System.out.println("The engine starts");
    }

    @Override
    public void moveCar() {
        System.out.println("The car moves");
    }
    public void stopEngine()
    {
        System.out.println("The emgine stops");
    }
}
class MyCar
{
    public static car getcar()
    {
        return new BMW();      //This is the factory method that returns a BMW car object.
    }
}
public class Main
{
    public static void main(String[] args)
    {
        car car =MyCar.getcar();       //This is a type of object upcasting
        car.startEngine();
        car.moveCar();
        car.stopEngine();
    }
}
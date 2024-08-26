package Car;

public class Main{
    public static void main(String[] args) {

        // Create a new Car.Car object (Calling the constructor)
        Car myCar = new Car("Toyota", "Camry", 2020);
        myCar.startEngine(); //Outputs "Engine started."

        System.out.println(myCar.getMake() + " " + myCar.getModel() + " " + myCar.getYear() + " " + myCar.getEngineRunning());

        myCar.setYear(2030); // Set the year of the car

        myCar.displayInfo();
        myCar.startEngine(); // Trying to start the engine again

        myCar.honk(); //Outputs "Honk! Honk!" or "Beep! Beep!" if the honk method is overridden
    }
}
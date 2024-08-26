package Car;

public class Car extends Vehicle {
    private String make;
    private String model;
    private int year;
    private boolean isEngineRunning;

    // Default constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.isEngineRunning = false;
    }

    // Getters and Setters to provide access to private variables for other classes
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean getEngineRunning() {
        return isEngineRunning;
    }

    public void startEngine() {
        if (!isEngineRunning) {
            isEngineRunning = true;
            System.out.println("Engine started.");
        } else {
            System.out.println("Engine is already running.");
        }


    }

    public void stopEngine() {
        if (isEngineRunning) {
            isEngineRunning = false;
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Engine is already stopped.");
        }
    }

    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine Running: " + isEngineRunning);
    }


    // Uncomment this method to override the honk method from the Vehicle class
//    @Override
//    public void honk() {
//        System.out.println("Beep! Beep!");
//    }

}
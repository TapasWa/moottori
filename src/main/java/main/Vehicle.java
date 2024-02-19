package main;
public class Vehicle {
    String manufacturer;
    String model;
    int maxSpeed;
    Engine engine;

    public Vehicle(String manufacturer, String model, int maxSpeed, Engine engine) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    void display() {
        String vehicleType = "";
        if (this instanceof Car) {
            vehicleType = "auto";
        } else if (this instanceof Plane) {
            vehicleType = "lentokone";
        } else if (this instanceof Ship) {
            vehicleType = "laiva";
        }
        
        String print = vehicleType + ": " + manufacturer + " " + model + "\n" +
                       "Moottori: " + engine.name + " " + engine.power + "kW\n" +
                       "Huippunopeus: " + maxSpeed + "km/h" + "\n";
        System.out.println(print);
    }
}

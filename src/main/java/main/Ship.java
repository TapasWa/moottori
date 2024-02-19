package main;

public class Ship extends Vehicle {
    public Ship(String manufacturer, String model, int maxSpeed, Engine engine) {
        super(manufacturer, model, maxSpeed, engine);
    }

    void sail() {
        System.out.println(manufacturer + " " + model + " seilaa merten ääriin!");
    }

    void display() {
        super.display();
    }
}

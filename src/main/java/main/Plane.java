package main;

public class Plane extends Vehicle {
    public Plane(String manufacturer, String model, int maxSpeed, Engine engine) {
        super(manufacturer, model, maxSpeed, engine);
    }

    void fly() {
        System.out.println(manufacturer + " " + model + " lentää kohteeseen!");
    }

    void display() {
        super.display();
    }
}

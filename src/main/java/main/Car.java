package main;

public class Car extends Vehicle {
    public Car(String manufacturer, String model, int maxSpeed, Engine engine) {
        super(manufacturer, model, maxSpeed, engine);
    }

    void drive() {
        System.out.println(manufacturer + " " + model + " paahtaa tietä eteenpäin!");
    }

    void display() {
        super.display();
    }
}

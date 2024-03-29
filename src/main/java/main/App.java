package main;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        int choice;
        do {
            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
                    int vehicleChoice = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    System.out.println("Anna kulkuneuvon valmistaja:");
                    String manufacturer = scanner.nextLine();

                    System.out.println("Anna kulkuneuvon malli:");
                    String model = scanner.nextLine();

                    System.out.println("Anna kulkuneuvon huippunopeus:");
                    int maxSpeed = scanner.nextInt();

                    switch (vehicleChoice) {
                        case 1:
                            vehicles.add(new Car(manufacturer, model, maxSpeed, new Engine("V8", 300)));
                            break;
                        case 2:
                            vehicles.add(new Plane(manufacturer, model, maxSpeed, new Engine("Suihkumoottori", 500)));
                            break;
                        case 3:
                            vehicles.add(new Ship(manufacturer, model, maxSpeed, new Engine("Wärtsilä Super", 1000)));
                            break;
                    }
                    break;
                case 2:
                    for (Vehicle vehicle : vehicles) {
                        vehicle.display();
                    }
                    break;
                case 3:
                    for (Vehicle vehicle : vehicles) {
                        if (vehicle instanceof Car) {
                            ((Car) vehicle).drive();
                        }
                    }
                    break;
                case 4:
                    for (Vehicle vehicle : vehicles) {
                        if (vehicle instanceof Plane) {
                            ((Plane) vehicle).fly();
                        }
                    }
                    break;
                case 5:
                    for (Vehicle vehicle : vehicles) {
                        if (vehicle instanceof Ship) {
                            ((Ship) vehicle).sail();
                        }
                    }
                    break;
            }
        } while (choice != 0);

        System.out.println("Kiitos ohjelman käytöstä.");
    }
}

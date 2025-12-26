import java.util.ArrayList;
import java.util.Scanner;

public class FleetApp {

    ArrayList<Vehicle> vehicles = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.println("""
                    1. Show vehicles
                    2. Add car
                    3. Add bus
                    4. Total insurance
                    5. Service all
                    6. Exit
                    """);

            int choice = sc.nextInt();

            if (choice == 1) show();
            else if (choice == 2) addCar();
            else if (choice == 3) addBus();
            else if (choice == 4) insurance();
            else if (choice == 5) service();
            else return;
        }
    }

    void show() {
        if (vehicles.isEmpty())
            System.out.println("No vehicles");
        else
            vehicles.forEach(System.out::println);
    }

    void addCar() {
        System.out.print("Model year price: ");
        vehicles.add(new Car(sc.next(), sc.nextInt(), sc.nextDouble()));
    }

    void addBus() {
        System.out.print("Model year price: ");
        vehicles.add(new Bus(sc.next(), sc.nextInt(), sc.nextDouble()));
    }

    void insurance() {
        double sum = 0;
        for (Vehicle v : vehicles)
            sum += v.calculateInsuranceFee();
        System.out.println("Total: " + sum);
    }

    void service() {
        for (Vehicle v : vehicles)
            ((Servicable) v).performService();
    }
}

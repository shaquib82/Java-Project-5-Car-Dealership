import java.util.Scanner;
/**
 * Main class to demonstrate the functionality of the car dealership system.
 */

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
         // Add some initial cars to the dealership inventory
        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
            new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
            new Car("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
        };
        
        Dealership dealership = new Dealership(cars);
        
        // Display menu options
        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.print("Welcome! Enter the type of car you're looking for: ");
         // Process user input
        String make = scan.nextLine();
        System.out.print("Enter your budget: ");
        int budget = scan.nextInt();          

        int index = dealership.search(make, budget);

        switch (index) {

            case 404: System.out.println("Feel free to browse through our collection of cars.\n");
            System.out.println(dealership);
            break;

            default: scan.nextLine();
            String decision = scan.nextLine();
            if (decision.equalsIgnoreCase("yes")) {
                dealership.sell(index);
            }

        }

    scan.close();

    }
}

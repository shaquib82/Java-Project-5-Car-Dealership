import java.util.Arrays;

public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public Car(String make, double price, int year, String color, String[] parts) {
        /**
     * Constructs a new Car object.
     * 
     * @param make The make of the car.
     * @param model The model of the car.
     * @param year The year of the car.
     * @param color The color of the car.
     * @param parts The parts of the car.
     */
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }
    public String getMake() {
        /**
     * Gets the make of the car.
     * 
     * @return The make of the car.
     */
        return this.make;
    }

    public double getPrice() {
        /** 
        * Gets the price of the car.
     * 
     * @return The price of the car.
     */
        return this.price;
    }

    public int getYear() {
         /** 
        * Gets the year of the car.
     * 
     * @return The year of the car.
     */
        return this.year;
    }

    public String getColor() {
         /** 
        * Gets the color of the car.
     * 
     * @return The color of the car.
     */
        return this.color;
    }
    
    public String[] getParts() {
        /** 
        * Gets the parts of the car.
     * 
     * @return The parts of the car.
     */
        return Arrays.copyOf(this.parts, this.parts.length) ;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public void drive() {
        System.out.println("\nYou bought the beautiful " + this.year + " " + this.color
        + " " + this.make + " for " + this.price + ".");
        System.out.println("Please drive your car to the nearest exit.\n");
    }

    public String toString() {
        return "Make: " + this.make + ".\n" 
            +  "Price: " + this.price + ".\n"
            +  "Year: " + this.year + ".\n"
            +  "Color: " + this.color + ".\n"
            +  "Parts: " + Arrays.toString(parts) + ".\n";
    }

}
